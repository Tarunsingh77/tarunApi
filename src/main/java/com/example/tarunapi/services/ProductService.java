package com.example.tarunapi.services;

import com.example.tarunapi.DTOs.ProductDtos;
import org.springframework.web.bind.annotation.*;

public interface ProductService {
    String getAllproducts();
    String getSingleProduct(  ProductDtos productDto);
    String addNewProduct(ProductDtos productDto);
    String updateProduct( ProductDtos productDto);

    String deleteProduct( ProductDtos productDto);
}
