package com.example.cartproducts.service.impl;


import com.example.cartproducts.entity.CartProduct;
import com.example.cartproducts.repo.CartProductRepo;
import com.example.cartproducts.service.CartProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartProductServiceImpl implements CartProductService {
    @Autowired
    private CartProductRepo cartProductRepo;


    @Override
    public CartProduct getById(int id) {
        return cartProductRepo.getById(id);
    }

    @Override
    public List<CartProduct> findAll() {
        return cartProductRepo.findAll();
    }


    @Override
    public CartProduct createCartProduct(CartProduct cartProduct) {
        return cartProductRepo.save(cartProduct);
    }



    @Override
    public CartProduct update(CartProduct cartProduct) {
        return cartProductRepo.save(cartProduct);
    }

    @Override
    public void delete(int id) {
        CartProduct cartProduct = cartProductRepo.getById(id);
        cartProductRepo.delete(cartProduct);
    }

}

