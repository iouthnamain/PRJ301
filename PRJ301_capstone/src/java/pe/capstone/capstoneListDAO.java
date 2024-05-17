/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.capstone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import pe.utils.DBUtils;

/**
 *
 * @author ADMIN
 */
public class capstoneListDAO {

    Connection con = null;
    PreparedStatement stm = null;
    ResultSet rs = null;
    DBUtils db = new DBUtils();

    public List<capstoneListDTO> search(String txtSearch) throws ClassNotFoundException, SQLException {
        List<capstoneListDTO> list = new ArrayList<>();
        try {
            con = db.getConnection();
            if (con != null) {
                String sql = "select * from tblCapstones where [name] like ? ";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + txtSearch + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    list.add(new capstoneListDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
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
        return list;
    }

    public boolean delete(String id)
            throws SQLException, NamingException, Exception {

        try {
            con = db.getConnection();
            if (con != null) {
                String sql = "DELETE FROM [dbo].[tblCapstones]\n"
                        + "      WHERE id = ?";

                stm = con.prepareStatement(sql);
                stm.setString(1, id);

                int row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }

        return false;
    }

//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        capstoneListDAO dao = new capstoneListDAO();
//        List<capstoneListDTO> list = dao.search("asdasd");
//        System.out.println(list.size());
//    }
}
