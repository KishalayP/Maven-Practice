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

@WebServlet(name = "CreateProductServlet", value = "/CreateProductServlet")
public class CreateProductServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        Integer price = Integer.valueOf(request.getParameter("price"));

        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);

        ProductBO productBO = ProductBOImpl.createProductBO();
        productBO.create(product);

        PrintWriter out = response.getWriter();
        out.println("Product Created!!!");
    }
}
