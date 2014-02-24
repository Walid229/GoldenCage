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
import java.util.Objects;
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
    @Override 
    public boolean equals(Object obj)
    { 
        if (obj == null) 
        { 
            return false; 
        } 
        if (getClass() != obj.getClass()) 
        { 
            return false;
        } 
        final MessageEntite other = (MessageEntite) obj; 
        if (this.getId_Mess() != other.getId_Mess()) 
        { 
            return false;
        } 
        if (this.getId_Envoye() != other.getId_Envoye()) 
        {
            return false;
        } 
        if (this.getId_Destinataire() != other.getId_Destinataire()) 
        { 
            return false;
        }
        if (!Objects.equals(this.message, other.message)) {
            return false; 
        } 
        return true;
    } /** * @return the id_Mess */
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
