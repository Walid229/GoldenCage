/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.metier;

import originals.sprint1.dao.CommentaireDAO;
import originals.sprint1.entities.CommentaireEntite;
import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */
public class CommentaireMetier {
    MyConnection cnx = new MyConnection();
    CommentaireEntite abnEnt = new CommentaireEntite();
    CommentaireDAO abnDao = new CommentaireDAO();
    
}
