/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package originals.sprint1.test;

import originals.sprint1.dao.AdministrateurDAO;
import originals.sprint1.entities.AdministrateurEntite;
import originals.sprint1.dao.PrestataireDAO;
import originals.sprint1.entities.PrestataireEntite;
import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */
public class Test {
    public static void main(String[] args){
        MyConnection cnx = new MyConnection();
        /*AbonnementEntite abn = new AbonnementEntite(1,10);
        AbonnementDAO abnDao = new AbonnementDAO();*/
        
       /* PrestataireEntite prest = new PrestataireEntite("walid","+216258456","menzah5","mori@zmo.tn",5);
        PrestataireDAO prestDAO = new PrestataireDAO();*/
        
        AdministrateurEntite adm = new AdministrateurEntite("login","123456");
        AdministrateurDAO admDAO = new AdministrateurDAO();
        
        
        cnx.getInstance();
       // abn.setDuree(12);
       // abn.setId_Prest(1);
      // abnDao.insert(abn);
        //test
        //prestDAO.insert(prest);
        //prestDAO.delete(prest);
        //prestDAO.find(prest);
        //abnDao.delete(abn);
        //abnDao.find(abn);
        admDAO.insert(adm);
    }
    
}
