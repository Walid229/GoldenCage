/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.metier;

import java.sql.ResultSet;
import originals.sprint1.dao.Message_PrestataireDAO;

/**
 *
 * @author user
 */
public class Message_PrestataireMetier {
    
    public ResultSet Message_PrestataireDAO(){
        Message_PrestataireDAO msgP = new Message_PrestataireDAO();
        return msgP.listFind();
    }
    
}
