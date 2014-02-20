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
public class AdministrateurDAO {
       public void updatePrestataire(AdministrateurEntite p){
        String requete = "update Administrateur set Login=? AND Pwd=? where Id_Admin=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, p.getId_Admin());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
    
}
