package by.anton.servlet;

import by.anton.security.Authentication;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/reg")
public class RegisterServlet extends HttpServlet {
    private Authentication authentication=Authentication.init();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name= (String) req.getParameter("name");
        String password= (String) req.getParameter("password");
        if(name!=null && password!=null){
            authentication.addUser(name,password);
            getServletContext().getRequestDispatcher("/").forward(req,resp);
        }
    }
}
