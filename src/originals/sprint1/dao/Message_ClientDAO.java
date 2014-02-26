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
import originals.sprint1.entities.Message_ClientEntite;
import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */
public class Message_ClientDAO implements GeneriqueDAO<Message_ClientEntite>
{
        //==========[AJOUTER MESSAGE]==========//
    @Override
    public boolean insert(Message_ClientEntite obj) 
    {
        try 
            {
                PreparedStatement prepare=MyConnection.getInstance().prepareStatement("insert into message_client(id_administrateur,id_client,message) values(?,?,?)");
                //prepare.setInt(1, obj.getId_Mess());
                  prepare.setInt(1, obj.getId_Client());
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
    public boolean delete(Message_ClientEntite obj) 
        {
            try 
                {
                    PreparedStatement prepare=MyConnection.getInstance().prepareStatement("delete from message_client where id_message_client='"+obj.getId_Mess()+"'");
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
    @Override
    public Message_ClientEntite find(Message_ClientEntite obj) 
        {
            try
                {
                    Statement st = MyConnection.getInstance().createStatement();
                    ResultSet res =st.executeQuery("select * from message_client where id_message_client='"+obj.getId_Mess()+"'");
                    res.next();
                    Message_ClientEntite m=new Message_ClientEntite(res.getInt(1), res.getInt(2),res.getString(3));
                    return m;
                }  
            catch (SQLException ex)
                {
                    System.out.println("Non valider");
                    return null;
                }
        }
//==========[AFFICHER TOUT LES MESSAGES]==========//
    
    public List listFind() throws SQLException 
        {
        Statement st = MyConnection.getInstance().createStatement();
        ResultSet res=st.executeQuery("select * from message_client");
        List<Message_ClientEntite> liste=new ArrayList<Message_ClientEntite>();
        while(res.next())
            {
                Message_ClientEntite e=new Message_ClientEntite(res.getInt(1), res.getInt(2),res.getString(3));
                liste.add(e);
            }
        return liste;  
        }

    @Override
    public boolean update(Message_ClientEntite obj1, Message_ClientEntite obj2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}   
        
     
  