/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package originals.sprint1.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karray
 */
/*
public class MyConnection {
    private static final  String driver = "com.mysql.jdbc.Driver";
    private String dbURL ;
    private String user ;
    private String password;
    Connection dbConnect = null;



    private static MyConnection instance;


    public MyConnection() {
        this.dbURL="jdbc:mysql://localhost:3306/goldencage";
        this.user="root";
        this.password="";

         try
        {
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dbConnect = DriverManager.getConnection("jdbc:mysql:" + this.dbURL, this.user, this.password);
            System.out.println("Connexion Valider");
        }
        catch(SQLException ex)
        {
        System.out.println("Erreur de connexion");
        }


    }



     //methode de getInstance pour le vérification de l'instance
    public static synchronized MyConnection getInstance()
    {
        if (instance==null)
        {
            System.out.println("Création de l'instance");
            instance=new MyConnection();

        }
       
        return  instance;

    }


    //elle retourne la connection

    public Connection getConnection()
    {
        return dbConnect;
    }




}*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Karray
 */
public class MyConnection {

     private static final  String driver = "com.mysql.jdbc.Driver";
   private static final  String url = "jdbc:mysql://localhost:3306/goldencage";
   private static final  String login = "root";
   private static final  String pwd = "";
   private static Connection con;


   public MyConnection(){

   }

   public Connection etablirConnection(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,login,pwd);
            System.out.println("Connexion établie");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur de chargement de driver"+ex.getMessage());
        } catch (SQLException ex){
            System.out.println("probleme d'etablissement de connection"+ex.getMessage());
        }

        return con;
    }
   public static Connection getInstance(){
       if (con==null){
           new MyConnection().etablirConnection();
       }
   return con;
   }
}