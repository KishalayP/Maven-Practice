package com.kishalay.product.bo;

import com.kishalay.product.dto.Product;

public interface ProductBO {
    void create(Product product);
    Product findProduct(int id);
}
