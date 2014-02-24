/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.metier;

import originals.sprint1.dao.MessageDAO;
import originals.sprint1.entities.MessageEntite;
import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */
public class MessageMetier {
    MyConnection cnx = new MyConnection();
    MessageEntite abnEnt = new MessageEntite();
    MessageDAO abnDao = new MessageDAO();
    
}
