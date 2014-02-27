/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.metier;

import javax.swing.JOptionPane;
import originals.sprint1.dao.ClientDAO;
import originals.sprint1.entities.ClientEntite;
import originals.sprint1.gui.Interface_Client;
import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */
public class ClientMetier {
    MyConnection cnx = new MyConnection();
    ClientEntite abnEnt = new ClientEntite();
   // ClientDAO abnDao = new ClientDAO();
    
    public void ajouterClient(){
        
    }
   public void verifierClient(ClientEntite cli){
         ClientDAO cDao=new ClientDAO();
        cli=cDao.findAuth(cli.getLogin(), cli.getPassword());
        if(cli!=null)
        {
            System.out.println("sa marche");
            Interface_Client a=new Interface_Client();
                a.setVisible(true);
                
        }
        else JOptionPane.showMessageDialog(null,"Votre login et mot de passe sont incorrecte ");}
    public void bannirClient(){
        
    }
    public void miseAjourClient(){
        
    }
}
