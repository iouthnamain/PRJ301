/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.utils.DBUtils;

/**
 *
 * @author ADMIN
 */
public class UserDAO {
    Connection con = null;
    PreparedStatement stm = null;
    ResultSet rs = null;
    DBUtils db = new DBUtils();
    
    public UserDTO checkLogin(String username, String password) throws ClassNotFoundException, SQLException {
        try {
            con = db.getConnection();
            if (con != null) {
                String sql = "select * from tblUsers where userID = ? and [password] = ?";

                stm = con.prepareStatement(sql);
                stm.setString(1, username);
                stm.setString(2, password);

                rs = stm.executeQuery();
                while(rs.next()) {
                    return new UserDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBoolean(5));
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return null;
        
    }
}
