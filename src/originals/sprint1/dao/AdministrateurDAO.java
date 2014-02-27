/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package originals.sprint1.dao;


import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import originals.sprint1.entities.AdministrateurEntite;
import originals.sprint1.util.MyConnection;

/**
 *test
 * @author user
 */
public class AdministrateurDAO implements GeneriqueDAO<AdministrateurEntite>{

    @Override
    public boolean insert(AdministrateurEntite obj) {
             try {
          PreparedStatement prepare=MyConnection.getInstance().prepareStatement("insert into administrateur (login, pwd) values (?,?) ");
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
            try {

        PreparedStatement prepare=MyConnection.getInstance().prepareStatement("UPDATE administrateur SET pwd='"+obj2.getPassword()+"';");

        prepare.executeUpdate();

        return true;

        } catch (SQLException ex) {
          return false;
        }
    }

    @Override
    public AdministrateurEntite find(AdministrateurEntite obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       public AdministrateurEntite findAuth(String login,String mdp)
    {

           try
        {
            
            Statement st=MyConnection.getInstance().createStatement();
            ResultSet res =st.executeQuery("select * from administrateur where login='"+login+"' and pwd='"+mdp+"';");

            AdministrateurEntite e=null;
            while (res.next())
            {
            e=new AdministrateurEntite(res.getString(2), res.getString(3));
            }
            return e;
        }

        catch (SQLException ex)
        {
            System.out.println("Non valider"+ex.getMessage());
            return null;
        }
    }
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

    
    

