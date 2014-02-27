/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.metier;

import java.sql.ResultSet;
import originals.sprint1.dao.Reclamation_ClientDAO;

/**
 *
 * @author user
 */
public class Reclamation_ClientMetier {

    
    public ResultSet consulterReclamation(){
        Reclamation_ClientDAO rec = new Reclamation_ClientDAO();
        return rec.DisplayAllReclamation();
    }
    public void envoyerReclamation(){
        
    }
    public void changerStatutReclamation(){
        
    }
}
