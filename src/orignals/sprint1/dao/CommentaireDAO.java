/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package orignals.sprint1.dao;


import edu.esprit.entities.Client;
import edu.esprit.entities.Commentaire;
import edu.esprit.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class CommentaireDAO {
    public void AjoutComm(Commentaire a){

   

        String requete = "insert into Commentaire values (?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,a.getId_Comm());
            ps.setInt(2,a.getPrest().getId_Prest());
            ps.setInt(3,a.getClient().getId_Client());
            ps.setString(4,a.getTextDuComm());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

    
     public void deleteCommentaire(int id){
        String requete = "delete from Commentaire where Id_Comm=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("commentaire supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Commentaire findCommentaireById(int id){
    Commentaire comm= new Commentaire();
     String requete = "select * from Commentaire where Id_Comm=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                comm.setId_Comm(resultat.getInt(1));
            }
            return comm;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du Commentaire"+ex.getMessage());
            return null;
        }
    }
    public Commentaire findClientByText(String text){
        Commentaire comm= new Commentaire();
     String requete = "select * from Commentaire where Commentaire=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, text);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                comm.setTextDuComm(resultat.getString(1));
            }
            return comm;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du Commentaire "+ex.getMessage());
            return null;
        }
    }

 
    public List<Commentaire> DisplayAllCommentaire (){


        List<Commentaire> listeCommentaire = new ArrayList<Commentaire>();

        String requete = "select * from Commentaire";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                
                Commentaire comm =new Commentaire();    
                comm.setId_Comm(resultat.getInt(1));
               /* comm.setPrest(PrestataireDAO(resultat.getInt(1)));
                comm.setId_Prest(resultat.getInt(3));*/
                comm.setTextDuComm(resultat.getString(4));
                listeCommentaire.add(comm);
            }
            return listeCommentaire;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Commentaire "+ex.getMessage());
            return null;
        }
    }
    
}
