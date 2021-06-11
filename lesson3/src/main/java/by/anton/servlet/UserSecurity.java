package by.anton.servlet;

import by.anton.security.Authentication;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/auth")
public class UserSecurity extends HttpServlet {
    private Authentication authentication=Authentication.init();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name= (String) req.getAttribute("name");
        String password= (String) req.getAttribute("password");
        if(authentication.checkUser(name,password)){
            getServletContext().getRequestDispatcher("/user.jsp").forward(req,resp);
        }else{
            req.setAttribute("error","не верный логин или пароль");
            getServletContext().getRequestDispatcher("/").forward(req,resp);
        }
    }
}
