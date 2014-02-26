/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.entities;




/**
 *
 * @author user
 */
public class Reclamation_ClientEntite { 
       
    private int id_Reclamation;
    private String reclamation_text;
    private int statut;
    private int id_Client;

    public Reclamation_ClientEntite(int id_Client,int statut,String reclamation_text) 
    
    {
        //this.id_Reclamation = id_Reclamation;
        this.statut = statut;
        this.id_Client = id_Client;
        this.reclamation_text = reclamation_text;
        
    }

    public Reclamation_ClientEntite() {}

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reclamation_ClientEntite other = (Reclamation_ClientEntite) obj;
        if (this.id_Reclamation != other.id_Reclamation) {
            return false;
        }
        if ((this.reclamation_text == null) ? (other.reclamation_text != null) : !this.reclamation_text.equals(other.reclamation_text)) {
            return false;
        }
        if (this.statut != other.statut) {
            return false;
        }
        if (this.id_Client != other.id_Client) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ReclamationEntite{" + "id_Reclamation=" + id_Reclamation + ", reclamation_text=" + reclamation_text + ", statut=" + statut + ", id_Client=" + id_Client + '}';
    }

    public int getId_Reclamation() {
        return id_Reclamation;
    }

    public void setId_Reclamation(int id_Reclamation) {
        this.id_Reclamation = id_Reclamation;
    }

    public String getReclamation_text() {
        return reclamation_text;
    }

    public void setReclamation_text(String reclamation_text) {
        this.reclamation_text = reclamation_text;
    }

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    public int getId_Client() {
        return id_Client;
    }

    public void setId_Client(int id_Client) {
        this.id_Client = id_Client;
    }
    
}
