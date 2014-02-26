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
public class Message_PrestataireEntite {
    
    private int id_Mess;
    private int id_Prestataire;
    private int id_Administrateur;
    private String message;

    public Message_PrestataireEntite( int id_Prestataire, int id_Administrateur, String message) {
        //this.id_Mess = id_Mess;
        this.id_Prestataire = id_Prestataire;
        this.id_Administrateur = id_Administrateur;
        this.message = message;
    }

    public int getId_Mess() {
        return id_Mess;
    }

    public void setId_Mess(int id_Mess) {
        this.id_Mess = id_Mess;
    }

    public int getId_Prestataire() {
        return id_Prestataire;
    }

    public void setId_Prestataire(int id_Prestataire) {
        this.id_Prestataire = id_Prestataire;
    }

    public int getId_Administrateur() {
        return id_Administrateur;
    }

    public void setId_Administrateur(int id_Administrateur) {
        this.id_Administrateur = id_Administrateur;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
        final Message_PrestataireEntite other = (Message_PrestataireEntite) obj;
        if (this.id_Mess != other.id_Mess) {
            return false;
        }
        if (this.id_Prestataire != other.id_Prestataire) {
            return false;
        }
        if (this.id_Administrateur != other.id_Administrateur) {
            return false;
        }
        if ((this.message == null) ? (other.message != null) : !this.message.equals(other.message)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MessagePrestataireEntite{" + "id_Mess=" + id_Mess + ", id_Prestataire=" + id_Prestataire + ", id_Administrateur=" + id_Administrateur + ", message=" + message + '}';
    }
    
    
    
}

