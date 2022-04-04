import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ViewColor", urlPatterns = "/viewcolor")
public class ViewColor extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String color = request.getParameter("color");
        if(color == null){
            request.getRequestDispatcher("/pickcolor.jsp").forward(request, response);
        } else{
            request.setAttribute("color", color);
            request.getRequestDispatcher("/viewcolor.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String color = request.getParameter("color");
        if(color == null){
            System.out.println(color);
            request.getRequestDispatcher("/pickcolor").forward(request, response);
        } else{
            System.out.println(color);
            request.setAttribute("color", color);
            request.getRequestDispatcher("/viewcolor.jsp").forward(request, response);
        }
    }
}
