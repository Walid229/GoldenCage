/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.test;

import originals.sprint1.dao.CommentaireDAO;
import originals.sprint1.entities.Commentaire;

import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */
public class TestCommentaire {
    public static void main(String[] args){
        MyConnection cnx = new MyConnection();
        Commentaire comm= new Commentaire();
        CommentaireDAO commDao = new CommentaireDAO();
        
        
        cnx.etablirConnection();
        
        comm.setTextDuComm("jezraohgjoahbt");
        commDao.AjoutComm(comm);
}
}
