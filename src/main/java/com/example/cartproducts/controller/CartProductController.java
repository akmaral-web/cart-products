package com.example.cartproducts.controller;

import com.example.cartproducts.entity.CartProduct;
import com.example.cartproducts.service.CartProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cart")

public class CartProductController {
    @Autowired
    private CartProductService cartProductService;

    @PostMapping("/create")
    public CartProduct createSalesProduct(@RequestBody CartProduct cartProduct) {
        return cartProductService.createCartProduct(cartProduct);
    }

    @PostMapping("/update")
    public  CartProduct update(@RequestBody CartProduct cartProduct){
        return cartProductService.update(cartProduct);
    }

    @PostMapping("/all")
    public List<CartProduct> findAll(){
        return cartProductService.findAll();
    }

    @GetMapping("/all/{id}")
    public CartProduct getById(@PathVariable int id ){
        return  cartProductService.getById(id);
    }

    @PostMapping("/delete")
    public void delete(@RequestParam int id ){
        cartProductService.delete(id);
    }

}

