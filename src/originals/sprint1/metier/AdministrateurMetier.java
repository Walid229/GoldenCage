/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package originals.sprint1.metier;

import originals.sprint1.dao.AdministrateurDAO;
import originals.sprint1.entities.AdministrateurEntite;



/**
 *
 * @author user
 */
public class AdministrateurMetier {
     public void ajout(){
       
        AdministrateurEntite admin = new AdministrateurEntite();
        AdministrateurDAO adminDAO = new AdministrateurDAO();   
        
        adminDAO.insert(admin);
    }
     public void mise_a_jour(){
       
        AdministrateurEntite admin = new AdministrateurEntite();
        AdministrateurDAO adminDAO = new AdministrateurDAO();   
        
        adminDAO.update(admin, admin);
    }
    
}
