/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import originals.sprint1.entities.MessageEntite;
import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */
public class MessageDAO implements GeneriqueDAO<MessageEntite>{

    @Override
    public boolean insert(MessageEntite obj) {
       try { 
           PreparedStatement prepare=MyConnection.getInstance().prepareStatement("insert into message values(?,?,?,?)");
           prepare.setInt(1, obj.getId_Mess());
           prepare.setInt(2, obj.getId_Envoye());
           prepare.setInt(3, obj.getId_Destinataire());
           prepare.setString(4,obj.getMessage());
           prepare.executeUpdate(); return true; 
       } 
       catch (SQLException ex) 
       {
           return false;
       }
    }

    @Override
    public boolean delete(MessageEntite obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(MessageEntite obj1, MessageEntite obj2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MessageEntite find(MessageEntite obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List listfind(MessageEntite obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    
    

