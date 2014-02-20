/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.test;

import originals.sprint1.dao.ClientDAO;
import originals.sprint1.entities.Client;

import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */
public class TestClient {
     public static void main(String[] args){
        MyConnection cnx = new MyConnection();
        Client cli= new Client();
        ClientDAO cliDao = new ClientDAO();
        
        
        cnx.etablirConnection();
        
        cli.setNom("zr,nsrnt");
        cliDao.AjoutClient(cli);
}
}
