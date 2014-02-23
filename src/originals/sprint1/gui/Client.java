/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.gui;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Setlec
 */
@Entity
@Table(name = "client", catalog = "GoldenCage", schema = "")
@NamedQueries({
    @NamedQuery(name = "Client.findAll", query = "SELECT c FROM Client c"),
    @NamedQuery(name = "Client.findByIdclient", query = "SELECT c FROM Client c WHERE c.clientPK.idclient = :idclient"),
    @NamedQuery(name = "Client.findByNom", query = "SELECT c FROM Client c WHERE c.nom = :nom"),
    @NamedQuery(name = "Client.findByLogin", query = "SELECT c FROM Client c WHERE c.login = :login"),
    @NamedQuery(name = "Client.findByPwd", query = "SELECT c FROM Client c WHERE c.pwd = :pwd"),
    @NamedQuery(name = "Client.findByPersonneIdPersonne", query = "SELECT c FROM Client c WHERE c.clientPK.personneIdPersonne = :personneIdPersonne"),
    @NamedQuery(name = "Client.findByPanierIdPanier", query = "SELECT c FROM Client c WHERE c.clientPK.panierIdPanier = :panierIdPanier"),
    @NamedQuery(name = "Client.findByReservationIdRes", query = "SELECT c FROM Client c WHERE c.clientPK.reservationIdRes = :reservationIdRes")})
public class Client implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ClientPK clientPK;
    @Basic(optional = false)
    @Column(name = "Nom")
    private String nom;
    @Basic(optional = false)
    @Column(name = "Login")
    private String login;
    @Basic(optional = false)
    @Column(name = "Pwd")
    private String pwd;

    public Client() {
    }

    public Client(ClientPK clientPK) {
        this.clientPK = clientPK;
    }

    public Client(ClientPK clientPK, String nom, String login, String pwd) {
        this.clientPK = clientPK;
        this.nom = nom;
        this.login = login;
        this.pwd = pwd;
    }

    public Client(int idclient, int personneIdPersonne, int panierIdPanier, int reservationIdRes) {
        this.clientPK = new ClientPK(idclient, personneIdPersonne, panierIdPanier, reservationIdRes);
    }

    public ClientPK getClientPK() {
        return clientPK;
    }

    public void setClientPK(ClientPK clientPK) {
        this.clientPK = clientPK;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        String oldNom = this.nom;
        this.nom = nom;
        changeSupport.firePropertyChange("nom", oldNom, nom);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        String oldLogin = this.login;
        this.login = login;
        changeSupport.firePropertyChange("login", oldLogin, login);
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        String oldPwd = this.pwd;
        this.pwd = pwd;
        changeSupport.firePropertyChange("pwd", oldPwd, pwd);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientPK != null ? clientPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.clientPK == null && other.clientPK != null) || (this.clientPK != null && !this.clientPK.equals(other.clientPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "originals.sprint1.gui.Client[ clientPK=" + clientPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
