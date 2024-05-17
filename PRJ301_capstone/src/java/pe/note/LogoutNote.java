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
public class LogoutNote {
    // TẠI TRANG SAU KHI LOGIN THÀNH CÔNG THÌ tạo 
    // 1 thẻ h2 dùng để thông báo welcome
    // Ex:   <h2> Welcome, ${sessionScope.acc.fullName}</h2>
    // //                session.setAttribute("acc", userCheck);
    // acc là do set từ session lên
    // fullname là tại userDTO (private String fullname) không phải là getFullName(); 
    //
    // Để logout, tạo form logout (tương tự Login nhưng h chỉ cần nút để gửi về sevlet không cần nhập j nữa
    // 
    //<form action="MainController" method="post">
//            <input type="submit" value="logout" name="action">
//        </form>
    
    // TƯƠNG TỰ LOGIN NÊN TỰ HIỂU
    // SAU KHI MainContrller nhận về value = "logout"  tạo 1 con serlet: LogoutController
    // 
    // else if(action.equals("logout")) {
//                url = "LogoutController";
//            }
    
    // tại LogoutController
    // 
    // String url = "login.jsp";
//        try{
//            HttpSession session = request.getSession();
//            session.removeAttribute("acc"); // tên session đã set trước đó
//        } finally {
//            response.sendRedirect(url); // chuyển về trang login.jsp
//        }
}
