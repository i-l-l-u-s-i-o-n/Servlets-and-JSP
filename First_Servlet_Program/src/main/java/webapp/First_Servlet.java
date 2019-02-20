package webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * created by Shivam on 20-02-2019.
 */


// We are extending a HttpServlet class so that to handel the HTTP REQUEST and give back a response to that request.


// Same name as we given in web.xml to the <welcome-file> ..... It is like a ROUTE.
// Here we are handling /login.do route. OR on the address localhost:8080/login.do, We have to execute following Servlet.
@WebServlet(urlPatterns = "/login.do")
public class First_Servlet extends HttpServlet{

    // We are using doGet() to handel the GET request.
    // The 2 parameters are ->
    // HttpRequest which has to be handled.
    // HttpResponse which has to be sent back.

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {


        PrintWriter out=httpServletResponse.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title> FIRST SERVLET </title>");
        out.println("</head>");
        out.println("<body> <h1> Exploring SERVLETS </h1></body>");
        out.println("</html>");





    }
}
