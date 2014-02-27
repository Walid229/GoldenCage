/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import originals.sprint1.entities.Message_PrestataireEntite;
import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */

    
public  class Message_PrestataireDAO implements GeneriqueDAO<Message_PrestataireEntite> {
    
       //==========[AJOUTER MESSAGE]==========//
    @Override
    public boolean insert(Message_PrestataireEntite obj) 
    {
        try 
            {
                PreparedStatement prepare=MyConnection.getInstance().prepareStatement("insert into message_prestataire(id_administrateur,id_prestataire,message) values(?,?,?)");
               // prepare.setInt(1, obj.getId_Mess());
                  prepare.setInt(1, obj.getId_Prestataire());
                  prepare.setInt(2, obj.getId_Administrateur());
                  prepare.setString(3,obj.getMessage());
                prepare.executeUpdate();
                return true;
            } 
        catch (SQLException ex)
            {
                return false;
            }   
      } 

        //==========[EFFACER MESSAGE]==========//
    @Override
    public boolean delete(Message_PrestataireEntite obj) 
        {
            try 
                {
                    PreparedStatement prepare=MyConnection.getInstance().prepareStatement("delete from message_prestataire where id_message_prestataire='"+obj.getId_Mess()+"'");
                    prepare.executeUpdate();
                    System.out.println("Delete ValidÃ©");
                    return true;
                }
            catch (SQLException ex) 
                {
                    System.out.println("Erreur de delete");
                    return false;
                }
        }
        //==========[CHERCHER MESSAGE]==========//
    public Message_PrestataireEntite find(Message_PrestataireEntite obj) 
        {
            try
                {
                    Statement st = MyConnection.getInstance().createStatement();
                    ResultSet res =st.executeQuery("select * from message_prestataire where id_message_prestataire='"+obj.getId_Mess()+"'");
                    res.next();
                    Message_PrestataireEntite m=new Message_PrestataireEntite( res.getInt(1), res.getInt(2),res.getString(3));
                    return m;
                }  
            catch (SQLException ex)
                {
                    System.out.println("Non valider");
                    return null;
                }
        }
    
    public ResultSet listFind()  
        {
        Statement st;
        try {
            st = MyConnection.getInstance().createStatement();
            ResultSet res=st.executeQuery("select id_prestataire as Identifiant, id_administrateur as Administrateur, message as Message from message_prestataire");
            return res;  
        } catch (SQLException ex) {
            Logger.getLogger(Message_PrestataireDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
//        List<Message_PrestataireEntite> liste=new ArrayList<Message_PrestataireEntite>();
//        while(res.next())
//            {
//                Message_PrestataireEntite e=new Message_PrestataireEntite( res.getInt(1), res.getInt(2),res.getString(3));
//                liste.add(e);
//            }
        
        }

    @Override
    public boolean update(Message_PrestataireEntite obj1, Message_PrestataireEntite obj2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

