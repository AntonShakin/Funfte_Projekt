import java.io.IOException;
import javax.servlet.RequestDispatcher;

public class BeanController extends javax.servlet.http.HttpServlet {
   // protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    //}

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        RequestDispatcher dispatch = request.getRequestDispatcher("index.jsp");
 dispatch.forward(request, response);
        DataBean data = new DataBean();
        data.setName("De Jay"); data.setOccupation("On Air Host"); data.setAge(25); data.setWorkingHours(100);
        request.setAttribute("data", data);
    }
}
