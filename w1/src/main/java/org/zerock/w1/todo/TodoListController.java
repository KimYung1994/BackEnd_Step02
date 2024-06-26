package org.zerock.w1.todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="todoListController", urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("/todo/list");
        
        System.out.println("DB로부터 목록을 꺼내어 list.jsp에 전달");

        req.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(req, resp);


    }
}
