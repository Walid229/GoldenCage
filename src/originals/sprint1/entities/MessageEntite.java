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

/** * * @author r.neffati */
public class MessageEntite {
        private int id_Mess; 
        private int id_Envoye; 
        private int id_Destinataire; 
        private String message; 
    public MessageEntite() { } 
    public MessageEntite(int id_Mess, int id_Envoye, int id_Destinataire, String message) 
        { this.id_Mess = id_Mess;
        this.id_Envoye = id_Envoye;
        this.id_Destinataire = id_Destinataire; 
        this.message = message; 
    }
    @Override 
    public String toString() { 
        return "Message{" + "id_Mess=" + getId_Mess() + ", id_Client=" + getId_Envoye() + ", id_Admin=" + getId_Destinataire() + ", message=" + getMessage() + '}'; 
    }
    /** * @return the id_Mess */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.id_Mess;
        hash = 89 * hash + this.id_Envoye;
        hash = 89 * hash + this.id_Destinataire;
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
        final MessageEntite other = (MessageEntite) obj;
        if (this.id_Mess != other.id_Mess) {
            return false;
        }
        if (this.id_Envoye != other.id_Envoye) {
            return false;
        }
        if (this.id_Destinataire != other.id_Destinataire) {
            return false;
        }
        if ((this.message == null) ? (other.message != null) : !this.message.equals(other.message)) {
            return false;
        }
        return true;
    }

    
    public int getId_Mess() 
    { 
        return id_Mess; 
    } /** * @param id_Mess the id_Mess to set */ 
    public void setId_Mess(int id_Mess) 
    {
        this.id_Mess = id_Mess;
    } /** * @return the id_Envoye */ 
    public int getId_Envoye()
    { 
        return id_Envoye; 
    } /** * @param id_Envoye the id_Envoye to set */
    public void setId_Envoye(int id_Envoye) 
    {
        this.id_Envoye = id_Envoye; 
    } /** * @return the id_Destinataire */ 
    public int getId_Destinataire()
    { 
        return id_Destinataire; 
    } /** * @param id_Destinataire the id_Destinataire to set */ 
    public void setId_Destinataire(int id_Destinataire) 
    { 
        this.id_Destinataire = id_Destinataire;
    } /** * @return the message */ 
    public String getMessage() 
    { return message; 
    } /** * @param message the message to set */ 
    public void setMessage(String message) 
    { 
        this.message = message; 
    } 
}
