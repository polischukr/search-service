import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "GetJSONServlet",
        urlPatterns = {"/json"}
)
public class GetJSONServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("application/json");
        PrintWriter out = res.getWriter();
        out.println("{");
        out.println("\"First Name\": \"Devesh\",");
        out.println("\"Last Name\": \"Sharma\"");
        out.println("}");
        out.close();
    }

}
