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

// When the page loads is :
//    http://localhost:8080/First_Servlet_Program_war/

// Then to activate this servlet, use the link ->
//    http://localhost:8080/First_Servlet_Program_war/anotherServlet

@WebServlet(urlPatterns = "/anotherServlet")
public class Another_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        PrintWriter out=httpServletResponse.getWriter();

        out.println("<h1>WORKED</h1>");
    }
}
