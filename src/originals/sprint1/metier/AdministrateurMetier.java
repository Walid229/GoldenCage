/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.metier;

import originals.sprint1.dao.AdministrateurDAO;
import originals.sprint1.entities.AdministrateurEntite;
import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */
public class AdministrateurMetier {
    MyConnection cnx = new MyConnection();
    AdministrateurEntite abnEnt = new AdministrateurEntite();
    AdministrateurDAO abnDao = new AdministrateurDAO();
    
}
