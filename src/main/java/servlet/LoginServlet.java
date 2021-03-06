package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.stream.Collectors;

@WebServlet(name ="LoginServlet", value = {"/login/*","/"})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Session.setUser(null);
        String content = new BufferedReader(new FileReader(new File("templates/login.html"))).lines()
                .collect(Collectors.joining("\n"));
        try (PrintWriter writer = resp.getWriter()) {
            writer.write(content);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*final Cookie[] cookies = req.getCookies();
        for(Cookie c: cookies){
            System.out.printf("name:%s, value:%s\n",c.getName(), c.getValue());
        }*/

        resp.sendRedirect("/users");
    }
}
