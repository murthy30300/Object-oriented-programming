package fib;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class fib extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();

        // Get the number of terms in the Fibonacci sequence from the request
        int n = Integer.parseInt(request.getParameter("n"));

        // Generate the Fibonacci sequence
        int a = 0;
        int b = 1;
        out.println(a);
        out.println(b);
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            out.println(c);
            a = b;
            b = c;
        }
    }
}
