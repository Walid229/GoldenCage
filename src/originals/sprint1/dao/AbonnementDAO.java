/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package originals.sprint1.dao;


import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import originals.sprint1.entities.AbonnementEntite;
import originals.sprint1.util.MyConnection;

/**
 *
 * @author user
 */
public class AbonnementDAO implements GeneriqueDAO<AbonnementEntite> {
    Statement st ;

    @Override
    public boolean insert(AbonnementEntite obj) {
      try {
          PreparedStatement prepare=MyConnection.getInstance().prepareStatement("insert into abonnement (duree, id_prestataire, date) values (?,?,?) ");
          prepare.setInt(1, obj.getId_Prest());
          prepare.setInt(1, obj.getDuree());
         // prepare.setDate(1, obj.getDate_Expiration());
          
          prepare.executeUpdate();
          System.out.println("Ajout effectuée avec succès");
          return true;

        } catch (SQLException ex) {
             System.out.println("erreur lors de l'insertion "+ex.getMessage());
          return false;
        }   
    }

    @Override
    public boolean delete(AbonnementEntite obj) {
try {
          PreparedStatement prepare=MyConnection.getInstance().prepareStatement("delete from abonnement where id_abonnement='"+obj.getId_Abonnement()+"'");
          prepare.executeUpdate();
          System.out.println("Delete Validé");
          return true;

        } catch (SQLException ex) {
          System.out.println("Erreur de delete" + ex.getMessage());
	  return false;
        }    }

    @Override
    public boolean update(AbonnementEntite obj1, AbonnementEntite obj2) {
         try {

        PreparedStatement prepare=MyConnection.getInstance().prepareStatement("UPDATE abonnement SET date='"+obj2.getDate_Expiration()+"';");

        prepare.executeUpdate();

        return true;

        } catch (SQLException ex) {
          return false;
        }
    }
    
    public boolean updateDate(Date date, String id) {
         try {

        PreparedStatement prepare=MyConnection.getInstance().prepareStatement("UPDATE abonnement SET date="+date+" where id_prestataire ="+id);

        prepare.executeUpdate();

        return true;

        } catch (SQLException ex) {
          return false;
        }
    }

    @Override
    public AbonnementEntite find(AbonnementEntite obj) {
        

        try
        {

            st=MyConnection.getInstance().createStatement();
            
            ResultSet res =st.executeQuery("select * from abonnement where id_abonnement="+obj.getId_Abonnement());
           
            res.next();

            AbonnementEntite e=new AbonnementEntite(res.getInt(2), res.getInt(3));
                System.out.println("Trouver :"+e.toString());
            return e;
            
        }

        catch (SQLException ex)
        {
            System.out.println("Non Trouver"+ex.getMessage());
            return null;
        }

    }
    
      public ResultSet findById(String id) {
        

        try
        {

            st=MyConnection.getInstance().createStatement();
            
            ResultSet res =st.executeQuery("select id_prestataire as Prestataire, duree as Durée, date as Date from abonnement where id_prestataire ="+id);
           
            return res;
            
        }

        catch (SQLException ex)
        {
            System.out.println("Non Trouver"+ex.getMessage());
            return null;
        }

    }
    
     public ResultSet findAll() {
        

        try
        {

            st=MyConnection.getInstance().createStatement();
            //select id_prestataire as Identifiant, nom as Nom, login as Login, pwd as 'Mot de Passe', tel as Telephone,addresse as Addresse,mail as Email, evaluation as Evaluation from prestataire 
            ResultSet res =st.executeQuery("select id_prestataire as Prestataire, duree as Durée, date as Date from abonnement");
            
//            List<AbonnementEntite> lsAbonement = new ArrayList<AbonnementEntite>();
//
//             while(res.next())
//            {
//                AbonnementEntite e=new AbonnementEntite(res.getInt(0), res.getInt(1), res.getInt(2), res.getDate(3));
//                System.out.println("Trouver :"+e.toString());
//                lsAbonement.add(e);
//            }
                
            return res;
            
        }

        catch (SQLException ex)
        {
            System.out.println("Non Trouver"+ex.getMessage());
            return null;
        }

    }
     
}

   
  
  

    
    /*
    public void insertAbonnement(Object obj){

   //test

       /* String requete = "insert into Abonnement (Duree, Id_Prest, Date_Expiration) values (?,1,"+15/01/2095+") ";
        try {
            PreparedStatement ps = MyConnection.getInstance().(requete);
            ps.setInt(1,a.getDuree());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        
        
        try {
          PreparedStatement prepare=MyConnection.getInstance().prepareStatement("insert into message values(?,?,?,?)");

            prepare.setInt(1, obj.getId_Mess());
            prepare.setInt(2, obj.getId_Envoye());
            prepare.setInt(3, obj.getId_Destinataire());
            prepare.setString(4,obj.getMessage());

          prepare.executeUpdate();
          return true;

        } catch (SQLException ex) {
          return false;
        }   
    }
        
        
        
        
    }
    
    public void updateAbonnement(AbonnementEntite d){
        String requete = "update Abonnement set Date_Expiration=? where Id_Abonnement=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, d.getId_Abonnement());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
    
     public void deleteAbonnement(int id){
        String requete = "delete from Abonnement where Id_Abonnement=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Abonnement supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }

/*
    public AbonnementEntite findAbonnementById(int id){
    AbonnementEntite abo = new AbonnementEntite();
     String requete = "select * from Abonnement where Id_Abonnement=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                abo.setId_Abonnement(resultat.getInt(1));
            }
            return abo;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de l'Abonnement "+ex.getMessage());
            return null;
        }
    }

 
    public List<AbonnementEntite> DisplayAllAbonnement (){


        List<AbonnementEntite> listeAbonnement = new ArrayList<AbonnementEntite>();

        String requete = "select * from Abonnement";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                
                PrestataireDAO prest = new PrestataireDAO();
                
                
                
                AbonnementEntite abo =new AbonnementEntite();    
                abo.setId_Abonnement(resultat.getInt(1));
                prest.findPrestataireById(abo.getId_Prest());
                

                listeAbonnement.add(abo);
                
            }
            return listeAbonnement;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Abonnement "+ex.getMessage());
            return null;
        }
    }
 
  */  