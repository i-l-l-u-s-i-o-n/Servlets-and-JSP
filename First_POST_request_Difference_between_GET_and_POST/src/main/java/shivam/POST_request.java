package shivam;

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
The main difference between GET and POST is that when, When we want to fetch some data, We use GET,
If we want to insert or submit some data, we use POST.

The submission made by GET method,  appears in the link,
The submission made by POST method, doesn't appear in the link.

So if are submitting sensitive info. such as password, we can use POST instead of GET.


 */
@WebServlet(urlPatterns = "/")
public class POST_request extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        httpServletRequest.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(httpServletRequest, httpServletResponse);
    }


    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        httpServletRequest.setAttribute("name", httpServletRequest.getParameter("name"));
        httpServletRequest.setAttribute("pass", httpServletRequest.getParameter("pw"));

        httpServletRequest.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(httpServletRequest, httpServletResponse);

    }
}

