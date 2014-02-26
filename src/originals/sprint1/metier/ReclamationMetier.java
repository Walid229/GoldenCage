/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.metier;

import originals.sprint1.dao.ReclamationDAO;
import originals.sprint1.entities.ReclamationEntite;
import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */
public class ReclamationMetier {
    MyConnection cnx = new MyConnection();
    ReclamationEntite abnEnt = new ReclamationEntite();
    ReclamationDAO abnDao = new ReclamationDAO();
    
}
