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

//Here we didn't created web.xml as we have directly specified the initial route(urlPatterns) to "/" .
//So when the application launches, following servlet will automatically executed,and we will be redirected to
//the First_JSP.jsp.
@WebServlet(urlPatterns = "/")
public class Redirect_to_JSP extends HttpServlet {

    //Here First we have to handel the GET request when ,the application launches.
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        PrintWriter out= response.getWriter();

        // To be redirected from Servlet, use getRequestDispatcher( path_to_JSP ) to redirect and then forward the request using
        // forward( req, res ) method ->

        // out.println("Welcome to SERVLET");  



        request.getRequestDispatcher("/WEB-INF/views/First_JSP.jsp").forward(request,response);

    }
}
