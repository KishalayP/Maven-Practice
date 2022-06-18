import com.kishalay.product.bo.ProductBO;
import com.kishalay.product.bo.ProductBOImpl;
import com.kishalay.product.dto.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DisplayProductDetailsServlet", value = "/DisplayProductDetailsServlet")
public class DisplayProductDetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ProductBO bo = ProductBOImpl.getProductBo();
        Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));

        PrintWriter writer = response.getWriter();
        writer.println("<body>Product Details<br>Product ID: "+product.getId());
        writer.println("<br>Product Name: "+product.getName());

        writer.println("<br>Product Description: "+product.getDescription());
        writer.println("<br>Product Price: "+product.getPrice() + "</body>");
    }

}
