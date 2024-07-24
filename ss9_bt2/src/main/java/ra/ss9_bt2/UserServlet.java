package ra.ss9_bt2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "UserServlet", value = "/userServlet")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/user.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        int ID = Integer.parseInt(req.getParameter("ID"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        int age = Integer.parseInt(req.getParameter("age"));

        req.getSession().setAttribute("ID", ID);
        req.getSession().setAttribute("name", name);
        req.getSession().setAttribute("email", email);
        req.getSession().setAttribute("age", age);
        req.getRequestDispatcher("/result.jsp").forward(req, resp);
    }
}
