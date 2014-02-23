/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package originals.sprint1.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import originals.sprint1.entities.AbonnementEntite;
import originals.sprint1.entities.PrestataireEntite;
import originals.sprint1.util.MyConnection;

/**
 *test
 * @author user
 */
public class PrestataireDAO extends GeneriqueDAO<PrestataireEntite> {

    @Override
    public boolean insert(PrestataireEntite obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(PrestataireEntite obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(PrestataireEntite obj1, PrestataireEntite obj2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PrestataireEntite find(PrestataireEntite obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      /*  public void insertAbonnement(PrestataireEntite p){

   

        String requete = "insert into depot (adresse_depot) values (?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,p.getId_Prest());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
        public void updatePrestataire(PrestataireEntite p){
        String requete = "update prestataire set Adresse=? AND Mail=? AND Telephone=? where Id_Prest=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, p.getId_Prest());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
    
     public void deletePrestataire(int id){
        String requete = "delete from Prestataire where Id_Prest=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Prestataire supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public AbonnementEntite findPrestataireById(int id){
    AbonnementEntite abo = new AbonnementEntite();
     String requete = "select * from Prestataire where Id_Prest=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                abo.setId_Prest(resultat.getInt(1));
            }
            return abo;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du Prestataire "+ex.getMessage());
            return null;
        }
    }

 
    public List<PrestataireEntite> DisplayAllPrestataire (){


        List<PrestataireEntite> listePrestataire = new ArrayList<PrestataireEntite>();

        String requete = "select * from Prestataire";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                PrestataireEntite abo =new PrestataireEntite();
                abo.setId_Prest(resultat.getInt(1));
                

                listePrestataire.add(abo);
            }
            return listePrestataire;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Pretataires "+ex.getMessage());
            return null;
        }
    }

*/
}
