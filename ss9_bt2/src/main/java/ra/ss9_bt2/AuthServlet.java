package ra.ss9_bt2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "AuthServlet", value = "/authServlet")
public class AuthServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (username.equals("admin") && password.equals("123")) {
            // dang nhap thanh cong
            req.getRequestDispatcher("/admin.jsp").forward(req, resp);
        }else {
            // đăng nhập thất bại
            req.setAttribute("error", "username or password is incorrect");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }
}

