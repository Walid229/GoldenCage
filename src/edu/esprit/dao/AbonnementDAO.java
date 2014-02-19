/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao;

import edu.esprit.entities.AbonnementEntite;
import edu.esprit.dao.PrestataireDAO;
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
public class AbonnementDAO {
    public void insertAbonnement(AbonnementEntite a){

   //test

        String requete = "insert into Abonnement values (?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,a.getId_Abonnement());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    public void updateAbonnement(AbonnementEntite d){
        String requete = "update Abonnement set Date_Expiration=? where Id_Abonnement=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, d.getId_Abonnement());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
    
     public void deleteAbonnement(int id){
        String requete = "delete from Abonnement where Id_Abonnement=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Abonnement supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }

/*
    public AbonnementEntite findAbonnementById(int id){
    AbonnementEntite abo = new AbonnementEntite();
     String requete = "select * from Abonnement where Id_Abonnement=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                abo.setId_Abonnement(resultat.getInt(1));
            }
            return abo;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de l'Abonnement "+ex.getMessage());
            return null;
        }
    }
*/
 
    public List<AbonnementEntite> DisplayAllAbonnement (){


        List<AbonnementEntite> listeAbonnement = new ArrayList<AbonnementEntite>();

        String requete = "select * from Abonnement";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                
                PrestataireDAO prest = new PrestataireDAO();
                
                
                
                AbonnementEntite abo =new AbonnementEntite();    
                abo.setId_Abonnement(resultat.getInt(1));
                prest.findPrestataireById(abo.getId_Prest());
                

                listeAbonnement.add(abo);
                
            }
            return listeAbonnement;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Abonnement "+ex.getMessage());
            return null;
        }
    }
 
    
}
