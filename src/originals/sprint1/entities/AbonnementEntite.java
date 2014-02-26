/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.entities;

import java.sql.Date;


/**
 *test
 * @author user
 */
public class AbonnementEntite {
    private  int id_Abonnement;
    private int id_Prestataire;
    private int duree;
    private Date date;
 /*   
   public AbonnementEntite(int duree){
        this.duree=duree;
        //this.date_Expiration=date_Expiration;
    }
*/
   public AbonnementEntite(){
       
   }

   public AbonnementEntite(int id_Prest, int duree){
       this.id_Prestataire=id_Prest;
        this.duree = duree;
        //this.date_Expiration = date_Expiration;
       
   }

   public void AbonnementEntite(int duree){
       this.duree=duree;
      // this.date_Expiration=date_Expiration;
       
   }
      

    /**
     * @return the id_Abonnement
     */
    public int getId_Abonnement() {
        return id_Abonnement;
    }

    /**
     * @param id_Abonnement the id_Abonnement to set
     */
    public void setId_Abonnement(int id_Abonnement) {
        this.id_Abonnement = id_Abonnement;
    }

    /**
     * @return the id_Prest
     */
    public int getId_Prest() {
        return id_Prestataire;
    }

    /**
     * @param id_Prest the id_Prest to set
     */
    public void setId_Prest(int id_Prest) {
        this.id_Prestataire = id_Prest;
    }

    /**
     * @return the duree
     */
    public int getDuree() {
        return duree;
    }

    /**
     * @param duree the duree to set
     */
    public void setDuree(int duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "AbonnementEntite{" + " id_Prest=" + id_Prestataire + ", duree=" + duree + ", date_Expiration=" + date + '}';
    }
    /**
     * @return the date_Expiration
     */
    public Date getDate_Expiration() {
        return date;
    }

    /**
     * @param date_Expiration the date_Expiration to set
     */
    public void setDate_Expiration(Date date_Expiration) {
        this.date = date_Expiration;
    }



    
    
    
}
