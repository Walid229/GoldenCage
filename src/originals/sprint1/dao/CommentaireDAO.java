/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.dao;



import originals.sprint1.entities.CommentaireEntite;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */
public class CommentaireDAO implements GeneriqueDAO<CommentaireEntite>{
   /* public void AjoutComm(CommentaireEntite a){

   

        String requete = "insert into CommentaireEntite values (?)";
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
        String requete = "delete from CommentaireEntite where Id_Comm=?";
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


    public CommentaireEntite findCommentaireById(int id){
    CommentaireEntite comm= new CommentaireEntite();
     String requete = "select * from CommentaireEntite where Id_Comm=?";
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
            System.out.println("erreur lors de la recherche du CommentaireEntite"+ex.getMessage());
            return null;
        }
    }
    public CommentaireEntite findClientByText(String text){
        CommentaireEntite comm= new CommentaireEntite();
     String requete = "select * from CommentaireEntite where CommentaireEntite=?";
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
            System.out.println("erreur lors de la recherche du CommentaireEntite "+ex.getMessage());
            return null;
        }
    }

 
    public List<Commentaire> DisplayAllCommentaire (){


        List<Commentaire> listeCommentaire = new ArrayList<Commentaire>();

        String requete = "select * from CommentaireEntite";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                
                CommentaireEntite comm =new CommentaireEntite();    
                comm.setId_Comm(resultat.getInt(1));
               /* comm.setPrest(PrestataireDAO(resultat.getInt(1)));
                comm.setId_Prest(resultat.getInt(3));*/
               /* comm.setTextDuComm(resultat.getString(4));
                listeCommentaire.add(comm);
            }
            return listeCommentaire;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des CommentaireEntite "+ex.getMessage());
            return null;
        }
    }*/

    @Override
    public boolean insert(CommentaireEntite obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(CommentaireEntite obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(CommentaireEntite obj1, CommentaireEntite obj2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CommentaireEntite find(CommentaireEntite obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List listfind(CommentaireEntite obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
