/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package originals.sprint1.test;
import edu.esprit.dao.*;
import edu.esprit.entities.*;
import edu.esprit.util.MyConnection;
import java.sql.Date;

/**
 *
 * @author user
 */
public class Test {
    public static void main(String[] args){
        MyConnection cnx = new MyConnection();
        AbonnementEntite abn = new AbonnementEntite();
        AbonnementDAO abnDao = new AbonnementDAO();
        
        
        cnx.etablirConnection();
        
        abn.setDuree(12);
        abnDao.insertAbonnement(abn);
        //test
        
    }
    
}
