/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package orignals.sprint1.dao;


import edu.esprit.entities.Client;
import edu.esprit.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ClientDAO {
    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
   public void AjoutClient(Client a){

   

        String requete = "insert into Client values (?)";
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
    
  /* public void updateClient(Client c){
        String requete = "update Client set Login=?, password=? where Id_Client=?";
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
    
     public void deleteClient(int id){
        String requete = "delete from Client where Id_Client=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Client supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Client findClientById(int id){
    Client cli= new Client();
     String requete = "select * from Client where Id_Client=?";
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
            System.out.println("erreur lors de la recherche du Client "+ex.getMessage());
            return null;
        }
    }
    public Client findClientByNom(String nom){
        Client cli= new Client();
     String requete = "select * from Client where nom=?";
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
            System.out.println("erreur lors de la recherche du Client "+ex.getMessage());
            return null;
        }
    }

 
    public List<Client> DisplayAllClient (){


        List<Client> listeClient = new ArrayList<Client>();

        String requete = "select * from Client";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                
                Client cli =new Client();    
                cli.setId_Client(resultat.getInt(1));
                cli.setNom(resultat.getString(2));
                cli.setLogin(resultat.getString(3));
                cli.setPassword(resultat.getString(4));
                listeClient.add(cli);
            }
            return listeClient;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Client "+ex.getMessage());
            return null;
        }
    }
 
    
}

    

