/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.metier;

import java.sql.ResultSet;
import originals.sprint1.dao.Message_ClientDAO;

/**
 *
 * @author user
 */
public class Message_ClientMetier {
    
    public ResultSet RechercherTous(){
        Message_ClientDAO msg = new Message_ClientDAO();
        return msg.listFind();
    }
            
    
    public void envoieMessage(){
        
    }
    public void afficheMessage(){
        
    }
}
