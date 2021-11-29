package com.example.cartproducts.repo;


import com.example.cartproducts.entity.CartProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartProductRepo extends JpaRepository<CartProduct, Integer> {
    CartProduct getById(int id);
    List<CartProduct> findAll();

}
