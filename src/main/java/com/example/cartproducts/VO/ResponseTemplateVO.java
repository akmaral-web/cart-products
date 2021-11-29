package com.example.cartproducts.VO;

import com.example.cartproducts.entity.CartProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private CartProduct cart;
    private Product product;
}
