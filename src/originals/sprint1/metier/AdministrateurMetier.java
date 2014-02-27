/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package originals.sprint1.metier;

import javax.swing.JOptionPane;
import originals.sprint1.dao.AdministrateurDAO;
import originals.sprint1.entities.AdministrateurEntite;
import originals.sprint1.gui.GererComptes;



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
     public void verifierAdmin(AdministrateurEntite admin){
         AdministrateurDAO aDao=new AdministrateurDAO();
        admin=aDao.findAuth(admin.getLogin(), admin.getPassword());
        if(admin!=null)
        {
            System.out.println("sa marche");
            GererComptes a=new GererComptes();
                a.setVisible(true);
                
        }
        else JOptionPane.showMessageDialog(null,"Administrateur: veuilez verifier votre Client  ");}
    
}
