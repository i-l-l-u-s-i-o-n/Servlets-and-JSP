package com.shivam;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * created by Shivam on 21-02-2019.
 */

/*
Using scriptlets is very bad practice !!!!!!

as JSP is only view, and we don't want to mess up it with business logic.

In a JSP file, we can use Scriptlets by using "<% %>" and "<%= %>"

See the JSP file .

 */
@WebServlet(urlPatterns = "/")
public class Using_scriptlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        RequestDispatcher redirect=httpServletRequest.getRequestDispatcher("/WEB-INF/views/index.jsp");

        redirect.forward(httpServletRequest,httpServletResponse);
    }
}
