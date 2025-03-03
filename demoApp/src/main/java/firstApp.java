import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class firstApp extends GenericServlet
{
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("response is ok here ");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("Ram Kumar here ");
    }
}
