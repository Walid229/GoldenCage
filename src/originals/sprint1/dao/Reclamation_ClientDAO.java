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
import originals.sprint1.entities.Reclamation_ClientEntite;
import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */
public class Reclamation_ClientDAO implements GeneriqueDAO<Reclamation_ClientEntite> {
    Statement st ;
    
      public ResultSet DisplayAllReclamation (){
        List<Reclamation_ClientEntite> listeReclamation = new ArrayList<Reclamation_ClientEntite>();

        String requete = "select id_reclamation as Identifiant ,id_client as Client, reclamation as Reclamation, statut as Statut from reclamation_client";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
//
//            while(resultat.next()){
//                Reclamation_ClientEntite r =new Reclamation_ClientEntite();
//                r.setReclamation_text(resultat.getString(2));
//                r.setStatut(resultat.getInt(3));
//               listeReclamation.add(r);
//               }
            return resultat;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
        
      }
      
      //==========[changer le statut de la reclamation]==========//
                        //===[traiter]===//
    public  void UpdateStatutTraitee(Reclamation_ClientEntite r){
        String requete;
          requete = "update reclamation_client set statut=1 where id_Reclamation=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,r.getStatut());
            ps.setInt(2,r.getId_Client());
            ps.executeUpdate();
            System.out.println("Mise Ã  jour effectuÃ©e avec succÃ¨s");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise Ã  jour "+ex.getMessage());
        }
    }
    
                    //===[en cour de traitement]===// 
        public  void UpdateStatutEnCours(Reclamation_ClientEntite r){
        String requete;
          requete = "update reclamation_client set statut=0 where id_Reclamation=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,r.getStatut());
            ps.setInt(2,r.getId_Client());
            ps.executeUpdate();
            System.out.println("Mise Ã  jour effectuÃ©e avec succÃ¨s");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise Ã  jour "+ex.getMessage());
        }
    }
        
        ////////////////// A MODIFIER !!!
          public Reclamation_ClientEntite findReclamationById(int id){
    Reclamation_ClientEntite r = new Reclamation_ClientEntite();
     String requete = "select * from reclamation where id_reclamation=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                r.setReclamation_text(resultat.getString(1));
                r.setStatut(resultat.getInt(2));
                
            }
            return r;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }

    @Override
//==========[AJOUTER RECLAMATION CLIENT]==========//    
    public boolean insert(Reclamation_ClientEntite obj) 
    {
         try 
            {
                PreparedStatement prepare=MyConnection.getInstance().prepareStatement("insert into reclamation_client(id_client , statut ,reclamation ) values(?,?,?)");
                //prepare.setInt(1, obj.getId_Reclamation());
                  prepare.setInt(1, obj.getId_Client());
                  prepare.setInt(2, obj.getStatut());
                  prepare.setString(3,obj.getReclamation_text());
                  
                prepare.executeUpdate();
                System.out.println("Ajout effectuÃ©e avec succÃ¨s");
                return true;
            } 
        catch (SQLException ex)
            {
                System.out.println("erreur lors de l'insertion "+ex.getMessage());
                return false;
            }   
    }

    @Override
    //==========[SUPPRIMER RECLAMATION PRESTATAIRE]==========// 
    public boolean delete(Reclamation_ClientEntite obj) {
       try {
          PreparedStatement prepare=MyConnection.getInstance().prepareStatement("delete from Reclamation_client where Id_Reclamation='"+obj.getId_Reclamation()+"'");
          prepare.executeUpdate();
          System.out.println("Delete ValidÃ©");
          return true;

        } catch (SQLException ex) {
          System.out.println("Erreur de delete" + ex.getMessage());
	  return false;
             }    
        }  

    @Override
    public boolean update(Reclamation_ClientEntite obj1, Reclamation_ClientEntite obj2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Reclamation_ClientEntite find(Reclamation_ClientEntite obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
    
