/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package originals.sprint1.gui;

import java.util.Date;
import com.toedter.calendar.JCalendar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils; //connection BD
import originals.sprint1.entities.PrestataireEntite;
import originals.sprint1.metier.AbonnementMetier;
import originals.sprint1.metier.Message_ClientMetier;
import originals.sprint1.metier.Message_PrestataireMetier;
import originals.sprint1.metier.PrestataireMetier;
import originals.sprint1.metier.Reclamation_ClientMetier;
import originals.sprint1.metier.Reclamation_PrestataireMetier;
/**
 *
 * @author user
 */
public class GererComptes extends javax.swing.JFrame {
    
    
    JFileChooser choix;
    String UrlImg=null;
    String nomImg="anonyme3.png";
    int retour;
    boolean click=false;
    JCalendar j1=new JCalendar();
    
    Connection conn;
    ResultSet rs=null;
    ResultSet rs1=null;
    ResultSet rs2=null;
    ResultSet rs3=null;
    ResultSet rs4=null;
    PreparedStatement pst=null;
    PreparedStatement pst1=null;
    PreparedStatement pst2=null;
    PreparedStatement pst3=null;
    PreparedStatement pst4=null;
        
        

    /**
     * Creates new form GererComptes
     */
    public GererComptes() {
        initComponents();
       // conn=MyConnection.getInstance();
       // update_table();
        //prestataire_table();
        getAllPrestaire();
        GetAllData();
       
    }
    
    private void getAllPrestaire(){
        
        PrestataireMetier pres = new PrestataireMetier();
        prestataire_table.setModel(DbUtils.resultSetToTableModel(pres.rechercherTous()));
       // prestataire_table.setModel()
        
    }
    
    private void GetAllData()
    {
    
         Reclamation_ClientMetier rec = new Reclamation_ClientMetier();
         notif_client_Table.setModel(DbUtils.resultSetToTableModel(rec.consulterReclamation()));
         
         Message_ClientMetier msgClient = new Message_ClientMetier();
         message_client_table.setModel(DbUtils.resultSetToTableModel(msgClient.RechercherTous()));
         
         AbonnementMetier abnM = new AbonnementMetier();
         abonnement_table.setModel(DbUtils.resultSetToTableModel(abnM.RechercheTous()));
         
         Reclamation_PrestataireMetier recP = new Reclamation_PrestataireMetier();
         notif_prest_Table.setModel(DbUtils.resultSetToTableModel(recP.RechercherTous()));
         
         Message_PrestataireMetier msgP = new Message_PrestataireMetier();
         message_prest_table.setModel(DbUtils.resultSetToTableModel(msgP.Message_PrestataireDAO()));
         
         
         
         
    }
    
   /* private void update_table()
    {
        try {
            String sql="select id_reclamation as Identifiant ,id_client as Client, reclamation as Reclamation, statut as Statut from reclamation_client ";
            String sql1="select id_client as Client, id_administrateur as Administrateur, message as Message from message_client";
            String sql2="select id_prestataire as Prestataire, duree as Durée, date as Date from abonnement";
            String sql3="select id_reclamation_prestataire as Identifiant,id_prestataire as Prestataire, reclamation as Reclamation, statut as Statut from reclamation_prestataire";
            String sql4="select id_prestataire as Identifiant, id_administrateur as Administrateur, message as Message from message_prestataire";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            pst1=conn.prepareStatement(sql1);
            rs1=pst1.executeQuery();
            pst2=conn.prepareStatement(sql2);
            rs2=pst2.executeQuery();
            pst3=conn.prepareStatement(sql3);
            rs3=pst3.executeQuery();
            pst4=conn.prepareStatement(sql4);
            rs4=pst4.executeQuery();
       
            
            notif_client_Table.setModel(DbUtils.resultSetToTableModel(rs));
            notif_prest_Table.setModel(DbUtils.resultSetToTableModel(rs3));
            message_client_table.setModel(DbUtils.resultSetToTableModel(rs1));
            message_prest_table.setModel(DbUtils.resultSetToTableModel(rs4));
            abonnement_table.setModel(DbUtils.resultSetToTableModel(rs2));
        } catch (SQLException ex) {
            Logger.getLogger(GererComptes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logout = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        notifTab = new javax.swing.JScrollPane();
        notif_client_Table = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        message_tab = new javax.swing.JScrollPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        message_client_table = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        abonnement_table = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        notif_prest_Table = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        message_tab1 = new javax.swing.JScrollPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        message_prest_table = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cbNom = new javax.swing.JCheckBox();
        cbCateg = new javax.swing.JCheckBox();
        cbLocalisation = new javax.swing.JCheckBox();
        tfRecherch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        prestataire_table = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        compte_table = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        label_details = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jTabbedPane4.setName("Accueil"); // NOI18N

        notif_client_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        notif_client_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notif_client_TableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                notif_client_TableMouseEntered(evt);
            }
        });
        notifTab.setViewportView(notif_client_Table);

        jScrollPane4.setViewportView(notifTab);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Reclamations des clients :");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Messages des clients:");

        message_client_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(message_client_table);

        message_tab.setViewportView(jScrollPane6);

        abonnement_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(abonnement_table);

        jScrollPane9.setViewportView(jScrollPane8);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Abonnements:");

        notif_prest_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(notif_prest_Table);

        jScrollPane10.setViewportView(jScrollPane7);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Reclamations des prestataires:");

        message_prest_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(message_prest_table);

        message_tab1.setViewportView(jScrollPane11);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Messages des prestataires:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addComponent(message_tab)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13)
                        .addComponent(jLabel9)
                        .addComponent(message_tab1)))
                .addGap(874, 1025, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(message_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(message_tab1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Accueil", jPanel1);

        jButton3.setText("Annuler");

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel14.setText("Selectionez votre critère de recherche ");

        cbNom.setText("nom");
        cbNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNomActionPerformed(evt);
            }
        });

        cbCateg.setText("catégorie");
        cbCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategActionPerformed(evt);
            }
        });

        cbLocalisation.setText("localisation");

        tfRecherch.setBackground(new java.awt.Color(204, 204, 255));
        tfRecherch.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        tfRecherch.setForeground(new java.awt.Color(51, 51, 51));
        tfRecherch.setBorder(null);
        tfRecherch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRecherchActionPerformed(evt);
            }
        });

        jButton1.setText("Go");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        prestataire_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        prestataire_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prestataire_tableMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(prestataire_table);

        jScrollPane14.setViewportView(jScrollPane12);

        compte_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Identifiant", "Expire le", "Durée"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        compte_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compte_tableMouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(compte_table);

        jScrollPane13.setViewportView(jScrollPane15);

        jLabel15.setText("La liste des prestataires");

        label_details.setText("Les details de l'abonnement");

        jCalendar1.setTodayButtonVisible(true);
        jCalendar1.setVisible(false);

        jButton5.setText("Valider");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setText("Ban");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbNom)
                                .addGap(18, 18, 18)
                                .addComponent(cbCateg)
                                .addGap(18, 18, 18)
                                .addComponent(cbLocalisation))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tfRecherch, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 686, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_details)
                            .addComponent(jLabel15))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCateg)
                    .addComponent(cbLocalisation)
                    .addComponent(jLabel14)
                    .addComponent(cbNom))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRecherch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(label_details)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton8))
                .addContainerGap(591, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Gérer les Comptes", jPanel2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1937, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1226, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Gérer les réclamations", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1937, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1226, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Statistiques", jPanel5);

        jLabel1.setText("Nom :");

        jLabel2.setText("Login :");

        jLabel3.setText("Mot de passe :");

        jLabel4.setText("Adresse :");

        jLabel5.setText("Mail :");

        jLabel6.setText("Numéro :");

        jLabel7.setText("Logo :");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton4.setText("Télécharger");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("Créer");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setText("Annuler");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(69, 69, 69)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField2)
                        .addComponent(jTextField3)
                        .addComponent(jTextField4)
                        .addComponent(jTextField5)
                        .addComponent(jTextField6)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1260, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(1548, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(277, 277, 277)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButton4)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 767, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(1133, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(44, 44, 44)))
        );

        jTabbedPane4.addTab("Créer Comptes", jPanel3);

        jTable1.setModel(new ListePrest());
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Valider");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(769, 769, 769)
                        .addComponent(jButton2)))
                .addContainerGap(1062, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton2)
                .addContainerGap(879, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Modifier Prestataires", jPanel6);

        jScrollPane3.setViewportView(jTabbedPane4);
        jTabbedPane4.getAccessibleContext().setAccessibleName("Accueil");

        jLabel16.setFont(new java.awt.Font("MV Boli", 2, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 102));
        jLabel16.setText("Golden Cage");

        jLabel17.setFont(new java.awt.Font("MV Boli", 2, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 102));
        jLabel17.setText("Golden Cage");

        jLabel18.setFont(new java.awt.Font("MV Boli", 2, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 102));
        jLabel18.setText("Golden Cage");

        jLabel19.setFont(new java.awt.Font("MV Boli", 2, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 102));
        jLabel19.setText("Golden Cage");

        jLabel20.setFont(new java.awt.Font("MV Boli", 3, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 102));
        jLabel20.setText("Golden Cage");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1167, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addGap(339, 339, 339)
                        .addComponent(logout)
                        .addGap(16, 16, 16)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(482, 482, 482)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(483, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(492, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(473, 473, 473)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(482, 482, 482)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(483, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(492, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(473, 473, 473)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout)
                    .addComponent(jLabel20))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(506, 506, 506)
                    .addComponent(jLabel16)
                    .addContainerGap(366, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(375, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addGap(497, 497, 497)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(506, 506, 506)
                    .addComponent(jLabel18)
                    .addContainerGap(366, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(375, Short.MAX_VALUE)
                    .addComponent(jLabel19)
                    .addGap(497, 497, 497)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        PrestataireEntite prest = new PrestataireEntite();
        prest.setNom(jTextField2.getText());
        prest.setLogin(jTextField3.getText());
        prest.setMdp(jTextField4.getText());
        prest.setAddresse(jTextField5.getText());
        prest.setEmail(jTextField6.getText());
        prest.setTelephone(jTextField7.getText());

        PrestataireMetier prestM = new PrestataireMetier();
        prestM.ajout(prest);
        /* PrestataireDAO pres = new PrestataireDAO();
        pres.insert(prest);*/

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        click=true;
        MonFiltre mfi = new MonFiltre(new String[]{"gif","tif","jpeg","jpg","tiff"},"les fichiers images (*.gif, *.tif,*.jpeg)");
        choix = new JFileChooser();
        choix.addChoosableFileFilter(mfi);
        retour=choix.showOpenDialog(choix);

        if(retour==choix.APPROVE_OPTION)
        {
            nomImg=choix.getSelectedFile().getName().toString();
            UrlImg=choix.getSelectedFile().getAbsolutePath();

            //afficher l'image dans la label

            ImageIcon img = new ImageIcon(UrlImg);
            img = new ImageIcon(img.getImage().getScaledInstance(100,100,jLabel8.CENTER));
            jLabel8.setIcon(img);

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void notif_client_TableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notif_client_TableMouseEntered

    }//GEN-LAST:event_notif_client_TableMouseEntered

    private void notif_client_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notif_client_TableMouseClicked

        /* try{
            int row=notif_Table.getSelectedRow();
            String table_click=(notif_Table.getModel().getValueAt(row, 2).toString());
            System.out.println("la veleuur est  "+table_click);
            String sql="select * from client where Id_client='"+table_click+"' ";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                //String add1 =rs.getString("Id_client");
                //text_test.setText(add1);
                Information_Client inf = new Information_Client();

                inf.setVisible(true);
                //this.setVisible(false);

            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }*/
    }//GEN-LAST:event_notif_client_TableMouseClicked

    private void cbNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNomActionPerformed

    private void cbCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategActionPerformed

    private void tfRecherchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRecherchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRecherchActionPerformed

    private void prestataire_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestataire_tableMouseClicked
        // TODO add your handling code here:
        try{
            
            int row=prestataire_table.getSelectedRow();
            String prest_click=(prestataire_table.getModel().getValueAt(row, 0).toString());
            
            System.out.println("la veleuur est  "+prest_click);
            
              AbonnementMetier abnM = new AbonnementMetier();
              rs = abnM.TrouverParId(prest_click);
              
              compte_table.setModel(DbUtils.resultSetToTableModel(rs));
            
//            String sql="select id_prestataire as Identifiant, date as Expire, duree as Durée from abonnement where id_prestataire="+prest_click;
//            
//            System.out.println(" sql"+sql);
//            pst=conn.prepareStatement(sql);
//            System.out.println(" sql"+sql);
//            rs=pst.executeQuery();
//            System.out.println(" sql"+sql);
//            
//            
//            System.out.println("la veleuur est  "+rs);
//            
//             compte_table.setModel(DbUtils.resultSetToTableModel(rs));
            
           

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_prestataire_tableMouseClicked

    private void compte_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compte_tableMouseClicked

        int row=compte_table.getSelectedRow();
        String date=(compte_table.getModel().getValueAt(row, 2).toString());

        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d = sdf.parse(date);
            jCalendar1.setVisible(true);
            jCalendar1.setDate(d);
        } catch (ParseException ex) {
            Logger.getLogger(GererComptes.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_compte_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String recherch = tfRecherch.getText();
        
        System.out.println(cbNom.isEnabled());
        
        if (cbNom.isSelected()) {
            System.out.println("rst");
            PrestataireMetier pres = new PrestataireMetier();
            ResultSet rst = pres.find(recherch, 0);
            
            
            prestataire_table.setModel(DbUtils.resultSetToTableModel(rst));
            System.out.println("rst");
            
        }
        
        if (cbLocalisation.isSelected()) {
             System.out.println("rst");
            PrestataireMetier pres = new PrestataireMetier();
            ResultSet rst = pres.find(recherch, 1);
            prestataire_table.setModel(DbUtils.resultSetToTableModel(rst));
             System.out.println("rst");
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int row=compte_table.getSelectedRow();
        String idprest =(compte_table.getModel().getValueAt(row, 1).toString());
        
        System.out.println(idprest);
        Date date = jCalendar1.getDate();
        
        AbonnementMetier abnM = new AbonnementMetier();
        boolean test = abnM.MajDate(date, idprest);
        
        
        System.out.println(test);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         int row=compte_table.getSelectedRow();
         String idprest =(compte_table.getModel().getValueAt(row, 0).toString());
        
         
         
        PrestataireMetier pres = new PrestataireMetier();
        // si ban alors ban = 0 si nn alors ban = 1
        pres.bannirPres(idprest, 0);
        
    }//GEN-LAST:event_jButton8ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GererComptes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GererComptes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GererComptes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GererComptes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GererComptes().setVisible(true);
            }
        });
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable abonnement_table;
    private javax.swing.JCheckBox cbCateg;
    private javax.swing.JCheckBox cbLocalisation;
    private javax.swing.JCheckBox cbNom;
    private javax.swing.JTable compte_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel label_details;
    private javax.swing.JButton logout;
    private javax.swing.JTable message_client_table;
    private javax.swing.JTable message_prest_table;
    private javax.swing.JScrollPane message_tab;
    private javax.swing.JScrollPane message_tab1;
    private javax.swing.JScrollPane notifTab;
    private javax.swing.JTable notif_client_Table;
    private javax.swing.JTable notif_prest_Table;
    private javax.swing.JTable prestataire_table;
    private javax.swing.JTextField tfRecherch;
    // End of variables declaration//GEN-END:variables
}
