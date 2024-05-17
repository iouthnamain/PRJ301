/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.note;

/**
 *
 * @author ADMIN
 */
public class DeleteNote {
    // DELETE  captonseList==============================================

    // tại captonseListDAO
    // tạo hàm  public boolean delete(int id) {}
    // 
//    public boolean delete(int id)
//            throws SQLException, NamingException, Exception {
//
//        try {
//            con = db.makeConnection();
//            if (con != null) {
//                String sql = "DELETE FROM [dbo].[Registration]\n"
//                        + "      WHERE id = ?";
    // ĐỔI TẠI ĐÂY, sửa sql viết lại câu lệnh delete
//
//                stm = con.prepareStatement(sql);
//                stm.setInt(1, id);
//
//                int row = stm.executeUpdate();
//                if (row > 0) {
//                    return true;
//                }
//            }
//        } finally {
//            if (stm != null) {
//                stm.close();
//            }
//            if (con != null) {
//                con.close();
//            }
//        }
//
//        return false;
//    }
    // Tại MainController else if ..
//    else if (button.equals("Delete")) {
//                url = "DeleteController"; // tạo servlet DeleteController
    
    // Tại DeleteController
//String url = "capstoneList.jsp";
//        try {
//            String pk = request.getParameter("pk");
//            capstoneListDAO dao = new capstoneListDAO();
//            boolean delete = dao.delete(pk);
//            
//            if (delete) {
//                url = "MainController?txtSearch=" + request.getParameter("lastSearch") +"&action=search";
//            } else {
//                request.setAttribute("deleteError", "Delete Wrong!");
//            }
//        } catch (Exception e) {
//        } finally {
//            request.getRequestDispatcher(url).forward(request, response);
//        }
}
