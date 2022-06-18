package com.kishalay.product.bo;

import com.kishalay.product.dao.ProductDAO;
import com.kishalay.product.dao.ProductDAOImpl;
import com.kishalay.product.dto.Product;

public class ProductBOImpl implements ProductBO{

    private static final ProductDAO dao = new ProductDAOImpl();
    @Override
    public void create(Product product) {
        dao.create(product);
    }

    static ProductBO productBo;
    public static ProductBO createProductBO(){
        productBo = new ProductBOImpl();
        return productBo;
    }

    public static ProductBO getProductBo(){
        return productBo;
    }


    @Override
    public Product findProduct(int id) {
        return dao.read(id);
    }
}
