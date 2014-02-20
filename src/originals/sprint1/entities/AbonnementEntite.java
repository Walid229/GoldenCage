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
    private int id_Prest;
    private int duree;
    private Date date_Expiration;
 /*   
   public AbonnementEntite(int duree){
        this.duree=duree;
        //this.date_Expiration=date_Expiration;
    }
*/
   
      

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
        return id_Prest;
    }

    /**
     * @param id_Prest the id_Prest to set
     */
    public void setId_Prest(int id_Prest) {
        this.id_Prest = id_Prest;
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

    /**
     * @return the date_Expiration
     */
    public Date getDate_Expiration() {
        return date_Expiration;
    }

    /**
     * @param date_Expiration the date_Expiration to set
     */
    public void setDate_Expiration(Date date_Expiration) {
        this.date_Expiration = date_Expiration;
    }



    
    
    
}
