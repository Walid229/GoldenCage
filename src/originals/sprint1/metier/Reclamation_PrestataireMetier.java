/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.metier;

import java.sql.ResultSet;
import originals.sprint1.dao.Reclamation_PrestataireDAO;

/**
 *
 * @author user
 */
public class Reclamation_PrestataireMetier {
    
    public ResultSet RechercherTous()
    {
        Reclamation_PrestataireDAO rec = new Reclamation_PrestataireDAO();
        return rec.DisplayAllReclamation();
    }
    
}
