package com.example.cartproducts.service;


import com.example.cartproducts.entity.CartProduct;

import java.util.List;

public interface CartProductService {
    CartProduct getById(int id);
    List<CartProduct> findAll();
    CartProduct createCartProduct(CartProduct cartProduct);
    CartProduct update(CartProduct cartProduct);
    void delete(int id);
}

