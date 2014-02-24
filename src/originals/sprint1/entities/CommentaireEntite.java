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
public class CommentaireEntite {
    private int id_Comm;
    private ClientEntite client;
    private PrestataireEntite prest;
    private String textDuComm;

    public CommentaireEntite() {
    }

    public CommentaireEntite(int id_Comm, ClientEntite client, PrestataireEntite prest, String textDuComm) {
        this.id_Comm = id_Comm;
        this.client = client;
        this.prest = prest;
        this.textDuComm = textDuComm;
    }

    public int getId_Comm() {
        return id_Comm;
    }

    public ClientEntite getClient() {
        return client;
    }

    public PrestataireEntite getPrest() {
        return prest;
    }

    public String getTextDuComm() {
        return textDuComm;
    }

    public void setId_Comm(int id_Comm) {
        this.id_Comm = id_Comm;
    }

    public void setClient(ClientEntite client) {
        this.client = client;
    }

    public void setPrest(PrestataireEntite prest) {
        this.prest = prest;
    }

    public void setTextDuComm(String textDuComm) {
        this.textDuComm = textDuComm;
    }

    @Override
    public String toString() {
        return "Commentaire{" + "id_Comm=" + id_Comm + ", client=" + client + ", prest=" + prest + ", textDuComm=" + textDuComm + '}';
    }

  

   

   
    
    
}
