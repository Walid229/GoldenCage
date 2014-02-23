/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package originals.sprint1.test;

import originals.sprint1.dao.AbonnementDAO;
import originals.sprint1.entities.AbonnementEntite;
import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */
public class Test {
    public static void main(String[] args){
        MyConnection cnx = new MyConnection();
        AbonnementEntite abn = new AbonnementEntite(1,10);
        AbonnementDAO abnDao = new AbonnementDAO();
        
        /*PrestataireEntite prest = new PrestataireEntite();
        PrestataireDAO prestDAO = new PrestataireDAO();*/
        
        
        cnx.getInstance();
       // abn.setDuree(12);
       // abn.setId_Prest(1);
      // abnDao.insert(abn);
        //test
        //prestDAO.insertPrestataire(prest);
        //abnDao.delete(abn);
        abnDao.find(abn);
        
    }
    
}
