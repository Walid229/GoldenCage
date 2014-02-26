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
public class Message_ClientEntite {
        private int id_Mess;
    private int id_Client;
    private int id_Administrateur;
    private String message;

    public Message_ClientEntite() {
    }

    public Message_ClientEntite( int id_Client, int id_Administrateur, String message) {
        //this.id_Mess = id_Mess;
        this.id_Client = id_Client;
        this.id_Administrateur = id_Administrateur;
        this.message = message;
    }

    public int getId_Mess() {
        return id_Mess;
    }

    public void setId_Mess(int id_Mess) {
        this.id_Mess = id_Mess;
    }

    public int getId_Client() {
        return id_Client;
    }

    public void setId_Client(int id_Client) {
        this.id_Client = id_Client;
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
        final Message_ClientEntite other = (Message_ClientEntite) obj;
        if (this.id_Mess != other.id_Mess) {
            return false;
        }
        if (this.id_Client != other.id_Client) {
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
        return "MessageEntitie{" + "id_Mess=" + id_Mess + ", id_Client=" + id_Client + ", id_Administrateur=" + id_Administrateur + ", message=" + message + '}';
    }
}
