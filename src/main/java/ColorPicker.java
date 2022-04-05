import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
@WebServlet(name = "ColorPicker", urlPatterns = "/pickcolor")
public class ColorPicker extends HttpServlet{


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        String color = request.getParameter("color");
        if(color == null){
            request.getRequestDispatcher("/pickcolor.jsp").forward(request, response);
        }
    }
}
