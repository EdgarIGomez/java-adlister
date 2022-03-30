import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

//    private int counter = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String hello = "<h1>Hello, World!</h1>";

        if(request.getParameter("name") != null){
            hello = "<h1>Hello, " +  request.getParameter("name") + "!</h1>";
        }

        PrintWriter out = response.getWriter();
        out.println(hello);

    }
}
