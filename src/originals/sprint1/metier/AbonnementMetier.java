/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package originals.sprint1.metier;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.ResultSet;
import java.util.Date;
import originals.sprint1.dao.AbonnementDAO;
import originals.sprint1.entities.AbonnementEntite;

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
    
    public boolean MajDate(Date date, String id){
        AbonnementDAO abn = new AbonnementDAO();
        return abn.updateDate(date, id);
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
    
    public ResultSet RechercheTous(){
        AbonnementDAO abn = new AbonnementDAO();
        return abn.findAll();
    }
            
    
    public void mise_a_jour(){
       
        AbonnementEntite abn = new AbonnementEntite();
        AbonnementDAO abnDao = new AbonnementDAO();   

        abnDao.update(abn, abn);
    } 
    
    public ResultSet TrouverParId(String id){
        AbonnementDAO abn = new AbonnementDAO();
        return abn.findById(id);
    }
}
