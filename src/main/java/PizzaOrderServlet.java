import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String[] toppings = request.getParameterValues("toppings");
        if (crust == null || sauce == null || size == null) {
            request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
        } else {
            System.out.println("Crust type: " + crust);

        }

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String[] toppings = request.getParameterValues("toppings");
        String address = request.getParameter("address");
        if (crust == null || sauce == null || size == null) {
            request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
        } else {
            System.out.println("Crust type: " + crust);
            System.out.println("Sauce type: " + sauce);
            System.out.println("Crust type: " + size);
            System.out.println("Crust type: " + Arrays.toString(toppings));
            System.out.println("Address: " + address);


        }
    }

}
