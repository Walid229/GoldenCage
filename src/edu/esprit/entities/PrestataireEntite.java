/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.entities;

import java.util.Objects;

/**
 *
 * @author user
 */
public class PrestataireEntite {
    private int id_Prest;
    private String nom;
    private String telephone;
    private String addresse;
    private String email;
    private float evaluation;

    public PrestataireEntite() {
    }

    public PrestataireEntite(int id_Prest, String nom, String telephone, String addresse, String email, float evaluation) {
        this.id_Prest = id_Prest;
        this.nom = nom;
        this.telephone = telephone;
        this.addresse = addresse;
        this.email = email;
        this.evaluation = evaluation;
    }

    public int getId_Prest() {
        return id_Prest;
    }

    public String getNom() {
        return nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAddresse() {
        return addresse;
    }

    public String getEmail() {
        return email;
    }

    public float getEvaluation() {
        return evaluation;
    }

    public void setId_Prest(int id_Prest) {
        this.id_Prest = id_Prest;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEvaluation(float evaluation) {
        this.evaluation = evaluation;
    }

    @Override
    public String toString() {
        return "Prestataire{" + "id_Prest=" + id_Prest + ", nom=" + nom + ", telephone=" + telephone + ", addresse=" + addresse + ", email=" + email + ", evaluation=" + evaluation + '}';
    }
    
}
