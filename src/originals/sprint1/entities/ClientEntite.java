/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.entities;

import java.sql.Date;

/**
 *
 * @author user
 */
public class ClientEntite {
   private int id_Client;
    private String nom;
    private String login;
    private String password;
    private String mail;
    private Date date_de_naissance;

    public ClientEntite() {
    }

    public ClientEntite(String login, String password,String nom,String mail,Date date_de_naissance) {
       // this.id_Client = id_Client;
        this.nom = nom;
        this.login = login;
        this.password = password;
        this.mail = mail;
        this.date_de_naissance = date_de_naissance;
    }

   


    public int getId_Client() {
        return id_Client;
    }

    public String getNom() {
        return nom;
    }


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setId_Client(int id_Client) {
        this.id_Client = id_Client;
    }
     

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(Date date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final ClientEntite other = (ClientEntite) obj;
        if (this.id_Client != other.id_Client) {
            return false;
        }
        if ((this.nom == null) ? (other.nom != null) : !this.nom.equals(other.nom)) {
            return false;
        }
        if ((this.login == null) ? (other.login != null) : !this.login.equals(other.login)) {
            return false;
        }
        if ((this.password == null) ? (other.password != null) : !this.password.equals(other.password)) {
            return false;
        }
        if ((this.mail == null) ? (other.mail != null) : !this.mail.equals(other.mail)) {
            return false;
        }
        if (this.date_de_naissance != other.date_de_naissance && (this.date_de_naissance == null || !this.date_de_naissance.equals(other.date_de_naissance))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClientEntitie{" + "id_Client=" + id_Client + ", nom=" + nom + ", login=" + login + ", password=" + password + ", mail=" + mail + ", date_de_naissance=" + date_de_naissance + '}';
    }
    
    
    
   

  

   
    
}
