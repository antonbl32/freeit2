package by.anton.servlet;

import by.anton.security.Authentication;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

@WebServlet("/auth")
public class UserSecurityServlet extends HttpServlet {
    private Authentication authentication=Authentication.init();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Optional<String> name= Optional.ofNullable(req.getParameter("name"));
        Optional<String> password= Optional.ofNullable(req.getParameter("password"));
        if(!name.isPresent() || !password.isPresent()){
            req.setAttribute("error","не верный логин или пароль");
            getServletContext().getRequestDispatcher("/").forward(req,resp);
        }else {
            Integer key = authentication.checkUser(name.get(), password.get());
            if (Objects.nonNull(key)) {
                Cookie cookie = new Cookie("key", key.toString());
                resp.addCookie(cookie);
                getServletContext().getRequestDispatcher("/user.jsp").forward(req, resp);
            } else {
                req.setAttribute("error", "не верный логин или пароль");
                getServletContext().getRequestDispatcher("/").forward(req, resp);
            }
        }
    }
}
