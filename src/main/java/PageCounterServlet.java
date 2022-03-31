import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PageCounterServlet", urlPatterns = "/count")
public class PageCounterServlet extends HttpServlet {

    private int counter = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        if(request.getParameter("counter") != null){
            counter = 0;
        }
        counter++;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2> The current page count is at: " + counter + "<h2>");



    }
}
