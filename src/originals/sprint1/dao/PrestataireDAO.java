/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package originals.sprint1.dao;


import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import originals.sprint1.entities.AbonnementEntite;
import originals.sprint1.entities.PrestataireEntite;
import originals.sprint1.util.MyConnection;

/**
 *test
 * @author user
 */
public class PrestataireDAO implements GeneriqueDAO<PrestataireEntite> {
    Statement st ;
    Image img;
    @Override
    public boolean insert(PrestataireEntite obj) {
        try {
          PreparedStatement prepare=MyConnection.getInstance().prepareStatement("insert into Prestataire (Nom, Telephone, Addresse, Email, Login, Mdp, Evaluation) values (?,?,?,?,?,?,?) ");
          
          prepare.setString(1, obj.getNom());
          prepare.setString(2, obj.getTelephone());
          prepare.setString(3, obj.getAddresse());
          prepare.setString(4, obj.getEmail());
          prepare.setString(5, obj.getLogin());
          prepare.setString(6, obj.getMdp());
          prepare.setFloat(7, obj.getEvaluation());
         // prepare.setDate(1, obj.getDate_Expiration());
          
          
          prepare.executeUpdate();
          System.out.println("Ajout effectuée avec succès");
          return true;

        } catch (SQLException ex) {
             System.out.println("erreur lors de l'insertion "+ex.getMessage());
          return false;
        } 
        
        
    }

    @Override
    public boolean delete(PrestataireEntite obj) {
try {
          PreparedStatement prepare=MyConnection.getInstance().prepareStatement("delete from Prestataire where Id_Prest=1");
          prepare.executeUpdate();
          System.out.println("Delete Validé");
          return true;

        } catch (SQLException ex) {
          System.out.println("Erreur de delete" + ex.getMessage());
	  return false;
        } 
    }

    @Override
    public boolean update(PrestataireEntite obj1, PrestataireEntite obj2) {
             try {

        PreparedStatement prepare=MyConnection.getInstance().prepareStatement("UPDATE Prestataire SET Telephone='"+obj2.getTelephone()+"';");

        prepare.executeUpdate();

        return true;

        } catch (SQLException ex) {
          return false;
        }
    }

    @Override
    public PrestataireEntite find(PrestataireEntite obj) {
            
        try
        {

            st=MyConnection.getInstance().createStatement();
            
            ResultSet res =st.executeQuery("select * from Prestataire where Id_Prest=2");
           
            res.next();

            PrestataireEntite e=new PrestataireEntite(res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getFloat(6), res.getString(7), res.getString(8));
                System.out.println("Trouver :"+e.toString());
            return e;
            
        }

        catch (SQLException ex)
        {
            System.out.println("Non Trouver"+ex.getMessage());
            return null;
        }
        
        
        
        
        
        
        
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
