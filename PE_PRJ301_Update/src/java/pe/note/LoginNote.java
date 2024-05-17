/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.note;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class LoginNote {
    // ==========================
    // LOGIN
    // tạo form login ở file jsp
    //----------------------------------------------------
//    <form action="MainController" method="POST" >
//            <h2>${requestScope.error}</h2>
//            User: <input type="text" name="username" value="" /><br>
//            Password: <input type="password" name="password" value="" /><br>
//            <input type="submit" name="action" value="LOGIN" />
//        </form>
    // ----------------------------------------------
    // nếu là Login thì sử dụng form này gần như không thay đổi gì cả
    
    // Sau đó, tại file MainController, tại else if ( thì để ý nếu nó nhận về btAcction thì
    // thẻ input vs type submit sửa name lại = đúng name mà MainController request
    // VD: Nếu tại MainConller:  String action = request.getParameter("btAction");
    // thì form login sửa lại <input type="submit" name="btAction" value="LOGIN" />
    
    // Sau đó tại MainConller else if(action.equals("****VALUE tại thẻ input submit ***")
    //else if(action.equals("LOGIN") {url = "LoginController";}
    // -> tạo Servlet với tên giống với tên url (LoginController)
    
    // ===============================================
    // tại LoginController (Servlet)
    // nhận về 2 giá trị với tên là username và password (giống name của thẻ input tại form login.jsp)
    // Ex: String username = request.getParameter("username"); (<input type="text" name="username" value="" />)
    
    // sau khi nhận username và pass thì tạo một file UserDAO nằm trong package của pe.user
    
    // =======================USER DAO==================================
    // khai báo 4 thuộc tính này tại đầu file
//        Connection con = null;
//        PreparedStatement stm = null;
//        ResultSet rs = null;
//        DBUtils db = new DBUtils();
    
    // tạo 1 function với tên là checkLogin trả về 1 UserDTO (tên class đã đặt trước đó)
//    public UserDTO checkUser(String username, String password) {
//
//        try {
//            con = db.getConnection();
//            if (con != null) {
    
    // SỬA TẠI ĐÂY . Viết lệnh SQL lấy thông tin người dùng 
    // ex:
//                String query = "select * from tblUsers where userID= ? and password = ?";
    
//                stm = con.prepareStatement(query);
//                stm.setString(1,username); // set 1 là dấu ? đầu tiên = vs username 
//                stm.setString(2, password); // tương tự
//
//                rs = stm.executeQuery();
//                while (rs.next()) {
//                    return new UserDTO(rs.getString("userID"), rs.getString("fullName"), rs.getString("password"), rs.getString("roleID"), rs.getBoolean("status"));
//                  SỬA LẠI RETURN, trả về đối tượng UserDTO
    //              rs.getString("userID") = tới tên trong cột SQL
    // cách khác    rs.getString(1) = bằng với cột đầu tiên
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return null;
//    }
    
    
    
    // =================QUAY LẠI LOGINCONTROLLER=============================
    // UserDao dao = new UserDao();
    // UserDTO acc = dao.checkLogin(username, password); // gọi function tại UserDao để kiểm tra
    
    // if(acc != null + "nếu có điều kiện kèm theo)) 
    // tại đây thường đề sẽ yêu cầu là nếu thành công thì sẽ chào mừng tên
    // -> session
    // 
//    HttpSession session = request.getSession();
//                session.setAttribute("acc", userCheck);
    // response.sendRedirect("Trang sau khi login thành công");
    // ngược lại else {
    // thông báo lỗi 
    // request.setAttribute("error", "Incorrect UserID or Password");
    // đây là lí do tại form login có 
    // <h2>${requestScope.error}</h2> (tên biến đã setAtribute) dùng để thông báo tk mk sai
    // request.getRequestDispatcher("login.jsp").forward(request, response);
    // 
    
    // FORM mẫu tại servlet
    //---------------------------------------------------
//    String user = request.getParameter("username");
//        String pass = request.getParameter("password");
//        
//        UserDAO dao = new UserDAO();
//        
//        UserDTO userCheck = dao.checkUser(user, pass);
//        
//        try {
//            if(userCheck != null) {
//                HttpSession session = request.getSession();
//                session.setAttribute("acc", userCheck); userCheck là gửi 1 đối tượng lên session, tương tự gửi 1 câu thông báo
//                response.sendRedirect("admin.jsp");
//            } else {
//                request.setAttribute("error", "Incorrect UserID or Password");
//                request.getRequestDispatcher("login.jsp").forward(request, response);
//            }
//        } catch (Exception e) {
//        }
    
}
