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
public class ClientEntite {
    private int id_Client;
    private String nom;
    private String login;
    private String password;

    public ClientEntite() {
    }

    public ClientEntite(int id_Client, String nom, String login, String password) {
        this.id_Client = id_Client;
        this.nom = nom;
        this.login = login;
        this.password = password;
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

    @Override
    public String toString() {
        return "Client{" + "id_Client=" + id_Client + ", nom=" + nom + ", login=" + login + ", password=" + password + '}';
    }


    
    
}
