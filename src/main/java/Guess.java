import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

@WebServlet(name = "guess", urlPatterns = "/guess")
public class Guess extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        String guess = request.getParameter("guess");
        Random random = new Random();
        int number = random.nextInt(4);

        if(guess == null){
            request.getRequestDispatcher("/guess.jsp").forward(request, response);
        }else if(Integer.parseInt(guess) == number){
            request.getRequestDispatcher("/correct").forward(request, response);
        }else{
            request.getRequestDispatcher("/incorrect").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String guess = request.getParameter("guess");
        Random random = new Random();
        int number = random.nextInt(4);

        if(guess == null){
            request.getRequestDispatcher("/guess.jsp").forward(request, response);
        }else if(Integer.parseInt(guess) == number){
            request.getRequestDispatcher("/correct").forward(request, response);
        }else{
            request.getRequestDispatcher("/incorrect").forward(request, response);
        }

    }

}
