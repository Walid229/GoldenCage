/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.entities;

import java.util.Objects;

/**
 *test
 * @author user
 */
public class AdministrateurEntite {
    private int id_Admin;
    private String login;
    private String password;

    public AdministrateurEntite() {
    }

    public AdministrateurEntite(int id_Admin, String login, String password) {
        this.id_Admin = id_Admin;
        this.login = login;
        this.password = password;
    }

    public int getId_Admin() {
        return id_Admin;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setId_Admin(int id_Admin) {
        this.id_Admin = id_Admin;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Administrateur{" + "id_Admin=" + id_Admin + ", login=" + login + ", password=" + password + '}';
    }
    
    
}
