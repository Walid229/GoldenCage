/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.entities;

/**
 *test
 * @author user
 */
public class PrestataireEntite {
    private int id_Prest;
    private String nom;
    private String telephone;
    private String addresse;
    private String email;
    private String login;
    private String mdp;
    private float evaluation;

    public PrestataireEntite() {
    }

    public PrestataireEntite( String nom, String telephone, String addresse, String email, float evaluation, String login, String mdp) {
        this.nom = nom;
        this.telephone = telephone;
        this.addresse = addresse;
        this.email = email;
        this.evaluation = evaluation;
        this.login=login;
        this.mdp=mdp;
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

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the mdp
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * @param mdp the mdp to set
     */
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final PrestataireEntite other = (PrestataireEntite) obj;
        if ((this.nom == null) ? (other.nom != null) : !this.nom.equals(other.nom)) {
            return false;
        }
        if ((this.telephone == null) ? (other.telephone != null) : !this.telephone.equals(other.telephone)) {
            return false;
        }
        if ((this.addresse == null) ? (other.addresse != null) : !this.addresse.equals(other.addresse)) {
            return false;
        }
        if ((this.email == null) ? (other.email != null) : !this.email.equals(other.email)) {
            return false;
        }
        if ((this.login == null) ? (other.login != null) : !this.login.equals(other.login)) {
            return false;
        }
        if ((this.mdp == null) ? (other.mdp != null) : !this.mdp.equals(other.mdp)) {
            return false;
        }
        if (Float.floatToIntBits(this.evaluation) != Float.floatToIntBits(other.evaluation)) {
            return false;
        }
        return true;
    }
    
}
