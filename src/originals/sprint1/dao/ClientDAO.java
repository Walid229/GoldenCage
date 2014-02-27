/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.dao;


import originals.sprint1.entities.ClientEntite;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */
public  class ClientDAO implements GeneriqueDAO<ClientEntite> 
{
 //==========[AJOUTER MESSAGE]==========//
    @Override
    public boolean insert(ClientEntite obj) 
    {
      try 
            {
                PreparedStatement prepare=MyConnection.getInstance().prepareStatement("insert into client (nom,login,password,mail,date_de_naissance) values (?,?,?,?,?)");
                  prepare.setString(1, obj.getNom());
                  prepare.setString(2, obj.getLogin());
                  prepare.setString(3,obj.getPassword());
                  prepare.setString(4,obj.getMail());
                  prepare.setDate(5,obj.getDate_de_naissance());
                prepare.executeUpdate();
                return true;
            } 
        catch (SQLException ex)
            {
                return false;
            }  
    }

    @Override
    public boolean delete(ClientEntite obj) {
        try 
                {
                    PreparedStatement prepare=MyConnection.getInstance().prepareStatement("delete from client where id_client='"+obj.getId_Client()+"'");
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

    

    @Override
    public ClientEntite find(ClientEntite obj) {
         try
                {
                    Statement st = MyConnection.getInstance().createStatement();
                    ResultSet res =st.executeQuery("select * from client where id_client='"+obj.getId_Client()+"'");
                    res.next();
                    ClientEntite m=new ClientEntite ( res.getString(1), res.getString(2), res.getString(3), res.getString(4),res.getDate(5));
                    return m;
                }  
            catch (SQLException ex)
                {
                    System.out.println("Non valider");
                    return null;
                }
    }
    
    public List listFind() throws SQLException 
        {
        Statement st = MyConnection.getInstance().createStatement();
        ResultSet res=st.executeQuery("select * from Message");
        List<ClientEntite> liste=new ArrayList<ClientEntite>();
        while(res.next())
            {
                ClientEntite e=new ClientEntite( res.getString(1), res.getString(2), res.getString(3), res.getString(4),res.getDate(5));
                liste.add(e);
            }
        return liste;  
        }
    
     public ClientEntite findAuth(String login,String mdp)
    {

           try
        {
            
            Statement st=MyConnection.getInstance().createStatement();
            ResultSet res =st.executeQuery("select * from client where login='"+login+"' and pwd='"+mdp+"';");

            ClientEntite cli=null;
            while (res.next())
            {
            cli=new ClientEntite(res.getString(2), res.getString(3), res.getString(4),res.getString(5), res.getDate(6));
            }
            return cli;
        }

        catch (SQLException ex)
        {
            System.out.println("Non valider"+ex.getMessage());
            return null;
        }
    }

    @Override
    public boolean update(ClientEntite obj1, ClientEntite obj2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}