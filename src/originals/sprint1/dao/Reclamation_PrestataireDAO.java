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
import originals.sprint1.entities.Reclamation_PrestataireEntite;
import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */
public class Reclamation_PrestataireDAO  implements GeneriqueDAO <Reclamation_PrestataireEntite> {
    
     //==========[afficher toutes les reclamations]==========//
    public List<Reclamation_PrestataireEntite> DisplayAllReclamation (){
        List<Reclamation_PrestataireEntite> listeReclamation = new ArrayList<Reclamation_PrestataireEntite>();

        String requete = "select * from reclamation_prestataire";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Reclamation_PrestataireEntite r =new Reclamation_PrestataireEntite();
                r.setReclamation_text(resultat.getString(2));
                r.setStatut(resultat.getInt(3));
               listeReclamation.add(r);
               }
            return listeReclamation;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
        
      }
    
    //==========[changer le statut de la reclamation]==========//
                        //===[traiter]===//
    public  void UpdateStatutTraitee(Reclamation_PrestataireEntite r){
        String requete;
          requete = "update reclamation_prestataire set statut=1 where id_Reclamation=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,r.getStatut());
            ps.setInt(2,r.getId_Prestataire());
            ps.executeUpdate();
            System.out.println("Mise Ã  jour effectuÃ©e avec succÃ¨s");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise Ã  jour "+ex.getMessage());
        }
    }
    
                        //===[en cour de traitement]===//       
     public  void UpdateStatutEnCours(Reclamation_PrestataireEntite r){
        String requete;
          requete = "update reclamation_Prestataire set statut=0 where id_Reclamation=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,r.getStatut());
            ps.setInt(2,r.getId_Prestataire());
            ps.executeUpdate();
            System.out.println("Mise Ã  jour effectuÃ©e avec succÃ¨s");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise Ã  jour "+ex.getMessage());
        }
    }
     //==========[AJOUTER RECLAMATION PRESTATAIRE]==========//    
     public boolean insert(Reclamation_PrestataireEntite obj) 
    {
         try 
            {
                PreparedStatement prepare=MyConnection.getInstance().prepareStatement("insert into reclamation_prestataire(id_prestataire , statut ,reclamation ) values(?,?,?)");
                //prepare.setInt(1, obj.getId_Reclamation());
                  prepare.setInt(2, obj.getId_Prestataire());
                  prepare.setInt(3, obj.getStatut());
                  prepare.setString(4,obj.getReclamation_text());
                prepare.executeUpdate();
                return true;
            } 
        catch (SQLException ex)
            {
                return false;
            }   
    }
     //==========[SUPPRIMER RECLAMATION PRESTATAIRE]==========// 
      public boolean delete(Reclamation_PrestataireEntite obj) {
       try {
          PreparedStatement prepare=MyConnection.getInstance().prepareStatement("delete from Reclamation_prestataire where Id_Reclamation='"+obj.getId_Reclamation()+"'");
          prepare.executeUpdate();
          System.out.println("Delete ValidÃ©");
          return true;

        } catch (SQLException ex) {
          System.out.println("Erreur de delete" + ex.getMessage());
	  return false;
             }    
        } 

    @Override
    public boolean update(Reclamation_PrestataireEntite obj1, Reclamation_PrestataireEntite obj2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Reclamation_PrestataireEntite find(Reclamation_PrestataireEntite obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     
}
   

