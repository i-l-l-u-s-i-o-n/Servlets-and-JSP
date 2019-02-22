package com.shivam.ToDo;

import com.shivam.login.UserValidationService;

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
@WebServlet(urlPatterns = "/todo")
public class ToDo_Servlet extends HttpServlet {

    //For Using ToDo services as retrieve list etc.
    ToDoService service=new ToDoService();

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {




        httpServletRequest.setAttribute("list",service.getList());
        httpServletRequest.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(httpServletRequest, httpServletResponse);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        // Adding new ToDo.

        service.addToDo(request.getParameter("newToDO"));


//        request.setAttribute("list",service.getList());
//        request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);

        //Above code causes the problem of DUPLICATE SUBMITTING.
        // If we do this, when we refresh page, it will add the last added Todo again.
        // So instead of showing data in the doPost(), we can redirect it to /todo servlet and let the doGet() execute.

        // Redirecting to Todo_servlet to list the todos.
        response.sendRedirect("/todo");





    }
}


