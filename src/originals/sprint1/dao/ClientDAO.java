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
public class ClientDAO implements GeneriqueDAO<ClientEntite>{
    
    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 /*  public void InsertClient(ClientEntite a){

   

        String requete = "insert into ClientEntite values (?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,a.getId_Client());
            ps.setString(2,a.getNom());
            ps.setString(3,a.getLogin());
            ps.setString(4,a.getPassword());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
  /* public void updateClient(ClientEntite c){
        String requete = "update ClientEntite set Login=?, password=? where Id_Client=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,c.getId_Client());
            ps.setString(2,c.getNom());
            ps.setString(3,c.getLogin());
            ps.setString(4,c.getPassword());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }*/
    /*
     public void deleteClient(int id){
        String requete = "delete from ClientEntite where Id_Client=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("ClientEntite supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public ClientEntite findClientById(int id){
    ClientEntite cli= new ClientEntite();
     String requete = "select * from ClientEntite where Id_Client=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                cli.setId_Client(resultat.getInt(1));
            }
            return cli;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du ClientEntite "+ex.getMessage());
            return null;
        }
    }
    public ClientEntite findClientByNom(String nom){
        ClientEntite cli= new ClientEntite();
     String requete = "select * from ClientEntite where nom=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                cli.setNom(resultat.getString(1));
            }
            return cli;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du ClientEntite "+ex.getMessage());
            return null;
        }
    }

 
    public List<Client> DisplayAllClient (){


        List<Client> listeClient = new ArrayList<Client>();

        String requete = "select * from ClientEntite";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                
                ClientEntite cli =new ClientEntite();    
                cli.setId_Client(resultat.getInt(1));
                cli.setNom(resultat.getString(2));
                cli.setLogin(resultat.getString(3));
                cli.setPassword(resultat.getString(4));
                listeClient.add(cli);
            }
            return listeClient;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des ClientEntite "+ex.getMessage());
            return null;
        }
    }
*/
    @Override
    public boolean insert(ClientEntite obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(ClientEntite obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ClientEntite obj1, ClientEntite obj2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClientEntite find(ClientEntite obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       public List listfind(ClientEntite obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
}

    

