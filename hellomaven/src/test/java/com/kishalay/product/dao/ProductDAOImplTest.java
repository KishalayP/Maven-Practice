package com.kishalay.product.dao;

import com.kishalay.product.dto.Product;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ProductDAOImplTest {
    @Test
    public void createShouldCreateAProduct(){
        ProductDAO dao = new ProductDAOImpl();
        Product product = new Product();
        product.setId(1);
        product.setName("Phone");
        product.setDescription("Nice Phone!");
        product.setPrice(1000);
        dao.create(product);

        Product result = dao.read(1);

        assertNotNull(result);
        assertEquals("Phone",result.getName());
    }
}
