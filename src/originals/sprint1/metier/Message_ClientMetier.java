/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.metier;

import originals.sprint1.dao.Message_ClientDAO;
import originals.sprint1.entities.Message_ClientEntite;
import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */
public class Message_ClientMetier {
    MyConnection cnx = new MyConnection();
    Message_ClientEntite abnEnt = new Message_ClientEntite();
    Message_ClientDAO abnDao = new Message_ClientDAO();
    
    public void envoieMessage(){
        
    }
    public void afficheMessage(){
        
    }
}
