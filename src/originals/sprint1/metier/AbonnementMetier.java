/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package originals.sprint1.metier;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import originals.sprint1.dao.AbonnementDAO;
import originals.sprint1.dao.AdministrateurDAO;
import originals.sprint1.entities.AbonnementEntite;
import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */
public class AbonnementMetier {
    public void ajout(){
       
        AbonnementEntite abn = new AbonnementEntite();
        AbonnementDAO abnDao = new AbonnementDAO();   
        
        abnDao.insert(abn);
       
    }
    
    public void supprimer(){
       
        AbonnementEntite abn = new AbonnementEntite();
        AbonnementDAO abnDao = new AbonnementDAO();   
            
        abnDao.delete(abn);
        
    } 
    
    public void recherche(){
       
        AbonnementEntite abn = new AbonnementEntite();
        AbonnementDAO abnDao = new AbonnementDAO();   

        abnDao.find(abn);
    } 
    
    public void mise_a_jour(){
       
        AbonnementEntite abn = new AbonnementEntite();
        AbonnementDAO abnDao = new AbonnementDAO();   

        abnDao.update(abn, abn);
    } 
}
