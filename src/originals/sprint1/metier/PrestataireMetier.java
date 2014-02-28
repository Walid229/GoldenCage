/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package originals.sprint1.metier;

import java.sql.ResultSet;
import originals.sprint1.dao.PrestataireDAO;
import originals.sprint1.entities.PrestataireEntite;
import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */
public class PrestataireMetier {
       public void ajout(PrestataireEntite p){
        //MyConnection cnx = new MyConnection();
        PrestataireEntite prest = new PrestataireEntite();
        PrestataireDAO prestDAO = new PrestataireDAO();
        
        if(p.equals(prest)){
         System.out.println("Erreur d'ajout, le prestataire existe");   
        }else  
            prestDAO.insert(p);
            
       
    }
       
       public boolean bannirPres(String id, int value){
           
           try {
               PrestataireDAO pres = new PrestataireDAO();
               pres.banPrestataire(id, value);
               return true;
           } catch (Exception e) {
               return false;
           }
           
       }
       
       public void supprimer(){
        
        PrestataireEntite prest = new PrestataireEntite();
        PrestataireDAO prestDAO = new PrestataireDAO();

        prestDAO.delete(prest);
     
    }
       
       public void rechercher(){
        
        PrestataireEntite prest = new PrestataireEntite();
        PrestataireDAO prestDAO = new PrestataireDAO();

        prestDAO.find(prest);
     
    }
       
       public ResultSet rechercherTous()
       {
           PrestataireDAO prestDAO = new PrestataireDAO();
           return prestDAO.DisplayAllPrestataire();
       }
       
       public void mise_a_jour(){
        
        PrestataireEntite prest = new PrestataireEntite();
        PrestataireDAO prestDAO = new PrestataireDAO();

        
        prestDAO.update(prest, prest);
     
    }

    public ResultSet find(String recherch, int i) {
        PrestataireDAO prestDAO = new PrestataireDAO();
        return prestDAO.find(recherch, i);
    }
    
}
