package com.shivam;

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

@WebServlet(urlPatterns = "/landing")
public class Passing_parameter extends HttpServlet {

    /*
    http://localhost:8080/Passing_Request_parameter_using_GET_method_war/

    this is the link,when our app launches.

    now to pass parameter, at the last of the link use "?" and then specify name of parameter and it's value as follows ->

    http://localhost:8080/Passing_Request_parameter_using_GET_method_war/?name="Shivam

    OR

    We can directly set this to our default route by setting ->
    @WebServlet(urlPatterns = "http://localhost:8080/Passing_Request_parameter_using_GET_method_war/?name=SHIVAM")

    */

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out=response.getWriter();

//        out.println("Passing parameter Using Get method by request.");
//        out.println("Passed parameters are : ");
//        out.println("Name : "+request.getParameter("name"));
//        http://localhost:8080/Passing_Request_parameter_using_GET_method_war/?name="Shivam"       just paste this link.

        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

        //======================= Passing parameter to JSP ==============================//

        String name=request.getParameter("name");
        String age= request.getParameter("age");


        // Passing parameter to our JSP.
        request.setAttribute("JSP_name",name);
        request.setAttribute("age",age);


        //by default, it will print WELCOME " "
        // But when we add ?name=SHIVAM, it will print WELCOME " SHIVAM "
        // The link will be ->

        //http://localhost:8080/Passing_Request_parameter_using_GET_method_war/?name=SHIVAM
        // To pass more than one parameter , use & to separate the parameters.

        //http://localhost:8080/Passing_Request_parameter_using_GET_method_war/?name=SHIVAM&age=22

        request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request,response);

    }
}
