/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package originals.sprint1.gui;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import originals.sprint1.dao.PrestataireDAO;
import originals.sprint1.entities.PrestataireEntite;

/**
 *
 * @author user
 */
public class ListePrest extends AbstractTableModel{
            String [] header={"id","Type","Quantité","id_depot"};
            List<PrestataireEntite> prestListe = new ArrayList<PrestataireEntite>();
   
            
    public ListePrest(){
          PrestataireDAO prestd= new PrestataireDAO();
        //prestListe = prestd.DisplayAllPrestataire();
             
    }
    
    public String getColumnName(int column){
        return header[column];
    }
            
    public int getRowCount() {
        return prestListe.size();
    }

    public int getColumnCount() {
            return header.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
            switch(columnIndex){
                case 0 :
                    return prestListe.get(rowIndex).getNom();
                case 1 :
                    return prestListe.get(rowIndex).getLogin();
                case 2 :
                    return prestListe.get(rowIndex).getMdp();
                case 3 :
                    return prestListe.get(rowIndex).getAddresse();
                case 4 :
                    return prestListe.get(rowIndex).getEmail();
                case 5 :
                    return prestListe.get(rowIndex).getTelephone();
                default:
                    
                    return null;
            }
    }
    
}
