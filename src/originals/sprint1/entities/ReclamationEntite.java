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
public class ReclamationEntite { 
        private int id_Reclamation; 
        private String reclamation_text; 
        private int statut; 
        private int id_Reclamant;
    public ReclamationEntite() { }
    public ReclamationEntite(int id_Reclamation, String reclamation_text,int id_Reclamant, int statut)
    { 
        this.id_Reclamation = id_Reclamation;
        this.reclamation_text = reclamation_text; 
        this.statut = statut; 
        this.id_Reclamant=id_Reclamant; 
    } 
    public int getId_Reclamation() 
    {
        return id_Reclamation; 
    }
    public String getReclamation_text()
    { 
        return reclamation_text; 
    } 
    public int getStatut()
    {
        return statut;
    }
    public void setId_Reclamation(int id_Reclamation)
    {
        this.id_Reclamation = id_Reclamation; 
    } 
    public void setReclamation_text(String reclamation_text) 
    {
        this.reclamation_text = reclamation_text;
    }
    public void setStatut(int statut) 
    {
        this.statut = statut;
    }
    @Override 
    public String toString()
    { 
        return "Reclamation{" + "id_Reclamation=" + id_Reclamation + ", reclamation_text=" + reclamation_text + ", statut=" + statut + '}';
    }
    
    @Override 
    public int hashCode() 
    {
        int hash = 7;
        hash = 89 * hash + this.id_Reclamation; 
        hash = 89 * hash + (this.reclamation_text != null ? this.reclamation_text.hashCode() : 0); 
        hash = 89 * hash + this.statut; return hash;
    } 

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ReclamationEntite other = (ReclamationEntite) obj;
        if (this.id_Reclamation != other.id_Reclamation) {
            return false;
        }
        if ((this.reclamation_text == null) ? (other.reclamation_text != null) : !this.reclamation_text.equals(other.reclamation_text)) {
            return false;
        }
        if (this.statut != other.statut) {
            return false;
        }
        if (this.id_Reclamant != other.id_Reclamant) {
            return false;
        }
        return true;
    }
/** * @return the id_Reclamant */ 
    public int getId_Reclamant()
    { 
        return id_Reclamant;
    } /** * @param id_Reclamant the id_Reclamant to set */ 
    public void setId_Reclamant(int id_Reclamant) 
    { 
        this.id_Reclamant = id_Reclamant;
    } 
}
