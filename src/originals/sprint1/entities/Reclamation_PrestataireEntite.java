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
public class Reclamation_PrestataireEntite {
    private int id_Reclamation;
    private String reclamation_text;
    private int statut;
    private int id_Prestataire;

    public Reclamation_PrestataireEntite() {}

    public Reclamation_PrestataireEntite(String reclamation_text, int statut, int id_Prestataire) {
       // this.id_Reclamation = id_Reclamation;
        this.reclamation_text = reclamation_text;
        this.statut = statut;
        this.id_Prestataire = id_Prestataire;
    }

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
        final Reclamation_PrestataireEntite other = (Reclamation_PrestataireEntite) obj;
        if (this.id_Reclamation != other.id_Reclamation) {
            return false;
        }
        if ((this.reclamation_text == null) ? (other.reclamation_text != null) : !this.reclamation_text.equals(other.reclamation_text)) {
            return false;
        }
        if (this.statut != other.statut) {
            return false;
        }
        if (this.id_Prestataire != other.id_Prestataire) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ReclamationPrestataireEntitie{" + "id_Reclamation=" + id_Reclamation + ", reclamation_text=" + reclamation_text + ", statut=" + statut + ", id_Prestataire=" + id_Prestataire + '}';
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

    public int getId_Prestataire() {
        return id_Prestataire;
    }

    public void setId_Prestataire(int id_Prestataire) {
        this.id_Prestataire = id_Prestataire;
    }
    
    
    
    
    
}

