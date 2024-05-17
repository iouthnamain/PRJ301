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
public class SearchNote {
    //
    // SEARCH==================================
    // Tạo một form Search tại trang đề yêu cầu sau khi login thành công
    //
//     <form action="MainController" method="GET">
//            Search user by Fullname: <input type="text" name="fullname" value="" required/><br>

    // ĐIỀU KIỆN KÈM THEO, TUỲ YÊU CẦU ĐÂY LÀ VÍ DỤ
//            Status: <input type="radio" name="status" value="true" /> True
//            <input type="radio" name="status" value="false" /> False
    //
//            <br><input type="submit" name="action" value="SEARCH" />
//        </form>
    // Tương tự login đéo muốn giải thích chỉ có ngu mới không pit
    // tại MainContrller 
//    else if(action.equals("SEARCH")) {
//                url = "SearchController"; -> Tạo servlet với tên là gì tự biết, đm đéo ai nói hoài
//            }
    // Tạo 1 file java.class với tên là : captonseListDAO
    // tại captonseListDAO tạo function
    // chứa 4 thuộc tính như UserDTO
    //        Connection con = null;
//        PreparedStatement stm = null;
//        ResultSet rs = null;
//        DBUtils db = new DBUtils();
    // tạo 1 function với tên là search(String txtSearch) trả về 1 list< (tên class đã đặt trước đó)>
    // Vì search thì lúc đéo nào chả trả về 1 list chứ có trả về đối tượng đéo đâu 
    // Ex: 
//    public List<captonseListDTO> search(String txtSearch) {
//        List<captonseListDTO> list = new ArrayList<>();
//
//        try {
//            con = db.getConnection();
//            if (con != null) {
//                String query = "select * from <Tên bảng> where fullName LIKE ?"; " and status = ?"; nếu có thì thêm
//                stm = con.prepareStatement(query);
//                stm.setString(1,"%" + fullname + "%");
//                stm.setString(2, status); // nếu có điều kiện search
//                rs = stm.executeQuery();
//                while (rs.next()) {
//                    list.add(new captonseListDTO(rs.get... Tương tự kia chỉ có khác cái là xong thì nó âdd vào list));
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return list;
//    }
    // Tại SearchController=========================
    // nhận về giá trị search. Ex: String fullname = request.getParameter("fullname");
    // captonseListDAO dao = new captonseListDAO;
    // List<captonseListDTO> list = dao.search(fullname); // gọi hàm ở captonseListDAO như Login
    // request.setAttribute("lastSearch", search);
//    if(list.size() == 0) {
//            request.setAttribute("error", "No result!");
//            request.getRequestDispatcher("Trả về trang sau khi login thành công (captonseList.jsp)").forward(request, response);
//        } else {
//            request.setAttribute("list", list); // gửi list kết quả đến trang jsp với tên là list
//            request.getRequestDispatcher("Trả về trang sau khi login thành công (captonseList.jsp)").forward(request, response);
//        }
    // Tại captonseList.jsp =============================
    // tạo bảng table
//<h3>Search value: ${requestScope.lastSearch}</h3>
//        <!--        <table>
//                    <tbody>
//                        <tr>
//                            <th>no</th>
//                            <th>ID</th>
//                            <th>Name</th>
//                            <th>Description</th> 
//                            <th>userID</th>
//                            <th>Delete</th>
//                        </tr>
//        <c:set var="index" value="0" />
//        <c:forEach var="c" items="${list}">
//            <c:set var="index" value="${index + 1}" />
//            <tr>
//                <td>${index}</td>
//                <td>${c.id}</td>
//                <td>${c.name}</td>
//                <td>${c.description}</td>
//                <td>${c.userID}</td>
//                <td><button><a href="MainController?action=delete&pk=${c.id}&lastSearch=${requestScope.lastSearch}">Delete</a></button></td>
//            </tr>
//        </c:forEach>
//    </tbody>
//</table>-->
//
//        <c:choose>
//            <c:when test="${empty list}">
//                <p>${xx}</p>
//            </c:when>
//            <c:otherwise>
//                <table>
//                    <tbody>
//                        <tr>
//                            <th>no</th>
//                            <th>ID</th>
//                            <th>Name</th>
//                            <th>Description</th> 
//                            <th>userID</th>
//                            <th>Delete</th>
//                        </tr>
//                        <c:set var="index" value="0" />
//                        <c:forEach var="c" items="${list}">
//                            <c:set var="index" value="${index + 1}" />
//                            <tr>
//                                <td>${index}</td>
//                                <td>${c.id}</td>
//                                <td>${c.name}</td>
//                                <td>${c.description}</td>
//                                <td>${c.userID}</td>
//                                <td><button><a href="MainController?action=delete&pk=${c.id}&lastSearch=${requestScope.lastSearch}">Delete</a></button></td>
//                            </tr>
//                        </c:forEach>
//                    </tbody>
//                </table>
//            </c:otherwise>
//        </c:choose>
}
