/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package originals.sprint1.dao;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import originals.sprint1.entities.AdministrateurEntite;
import originals.sprint1.util.MyConnection;

/**
 *test
 * @author user
 */
public class AdministrateurDAO extends GeneriqueDAO<AdministrateurEntite>{

    @Override
    public boolean insert(AdministrateurEntite obj) {
             try {
          PreparedStatement prepare=MyConnection.getInstance().prepareStatement("insert into Administrateur (Login, Pwd) values (?,?) ");
          prepare.setString(1, obj.getLogin());
          prepare.setString(2, obj.getPassword());
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
    public boolean delete(AdministrateurEntite obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(AdministrateurEntite obj1, AdministrateurEntite obj2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AdministrateurEntite find(AdministrateurEntite obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
    
    
    
    
    
    
    
       /*public void updatePrestataire(AdministrateurEntite p){
        String requete = "update Administrateur set Login=? AND Pwd=? where Id_Admin=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, p.getId_Admin());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }*/

    
    
}
