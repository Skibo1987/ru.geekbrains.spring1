

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;



@WebServlet(name = "Product", urlPatterns = "/product")
public class Product extends HttpServlet {


    public Product(int i, String coffee, int i1) {
    }

    public ArrayList<Product> Products(int id) {
        return new ArrayList<>(Arrays.asList(
                new Product(1, "Cream", 110),
                new Product(2, "Bread", 50),
                new Product(3, "Juice", 60),
                new Product(4, "Butter", 120),
                new Product(5, "Coffee", 200),
//                new Product(6, "Tea", 150)
        ));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        int id = Integer.parseInt(req.getParameter("id"));

        out.println("<h1>" + String.format("%d", Products(id)) + "</h1>");
        out.close();






    }


}
