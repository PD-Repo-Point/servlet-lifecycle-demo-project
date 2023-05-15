import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {

    public SignUpServlet(){
        System.out.println("SignUpServlet instance is created ... "); // object is created
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init() being called ... "); // object ---> servlet
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service() is called ... ");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("Current Time : "+ LocalDateTime.now());
        out.println("</body></html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet() is called ... ");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("Current Time : "+ LocalDateTime.now());
        out.println("</body></html>");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() being called ... ");
    }
}
