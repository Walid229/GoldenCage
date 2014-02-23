/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.gui;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Setlec
 */
@Embeddable
public class ClientPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "Id_client")
    private int idclient;
    @Basic(optional = false)
    @Column(name = "personne_Id_Personne")
    private int personneIdPersonne;
    @Basic(optional = false)
    @Column(name = "panier_Id_Panier")
    private int panierIdPanier;
    @Basic(optional = false)
    @Column(name = "reservation_Id_Res")
    private int reservationIdRes;

    public ClientPK() {
    }

    public ClientPK(int idclient, int personneIdPersonne, int panierIdPanier, int reservationIdRes) {
        this.idclient = idclient;
        this.personneIdPersonne = personneIdPersonne;
        this.panierIdPanier = panierIdPanier;
        this.reservationIdRes = reservationIdRes;
    }

    public int getIdclient() {
        return idclient;
    }

    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }

    public int getPersonneIdPersonne() {
        return personneIdPersonne;
    }

    public void setPersonneIdPersonne(int personneIdPersonne) {
        this.personneIdPersonne = personneIdPersonne;
    }

    public int getPanierIdPanier() {
        return panierIdPanier;
    }

    public void setPanierIdPanier(int panierIdPanier) {
        this.panierIdPanier = panierIdPanier;
    }

    public int getReservationIdRes() {
        return reservationIdRes;
    }

    public void setReservationIdRes(int reservationIdRes) {
        this.reservationIdRes = reservationIdRes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idclient;
        hash += (int) personneIdPersonne;
        hash += (int) panierIdPanier;
        hash += (int) reservationIdRes;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientPK)) {
            return false;
        }
        ClientPK other = (ClientPK) object;
        if (this.idclient != other.idclient) {
            return false;
        }
        if (this.personneIdPersonne != other.personneIdPersonne) {
            return false;
        }
        if (this.panierIdPanier != other.panierIdPanier) {
            return false;
        }
        if (this.reservationIdRes != other.reservationIdRes) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "originals.sprint1.gui.ClientPK[ idclient=" + idclient + ", personneIdPersonne=" + personneIdPersonne + ", panierIdPanier=" + panierIdPanier + ", reservationIdRes=" + reservationIdRes + " ]";
    }
    
}
