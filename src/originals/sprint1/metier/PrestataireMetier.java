/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.metier;

import originals.sprint1.dao.PrestataireDAO;
import originals.sprint1.entities.PrestataireEntite;
import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */
public class PrestataireMetier {
    MyConnection cnx = new MyConnection();
    PrestataireEntite abnEnt = new PrestataireEntite();
    PrestataireDAO abnDao = new PrestataireDAO();
}
