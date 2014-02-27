/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package originals.sprint1.dao;

import java.sql.ResultSet;

/**
 *
 * @author user
 */
public interface GeneriqueDAO <T>{
    

   /*public Connection connect()
    {
        return MyConnection.getInstance().getConnection();
    }*/
    public abstract boolean insert(T obj);
    public abstract boolean delete(T obj);
    public abstract boolean update(T obj1,T obj2);
    public abstract T find(T obj);
    //public abstract List listFind() throws SQLException;


}
