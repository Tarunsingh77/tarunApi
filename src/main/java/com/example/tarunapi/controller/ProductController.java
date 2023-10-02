package com.example.tarunapi.controller;

import com.example.tarunapi.DTOs.ProductDtos;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.*;

import static lombok.ToString.*;
@Getter
@Setter
@RestController
public class ProductController {

    @GetMapping("/products")
    public String getAllproducts(){
        return "getting all products";
    }

    @GetMapping("/products/{productId}")
    public String getSingleProduct(@PathVariable("productId") Long productId,@RequestBody ProductDtos productDto){
        return "returting single product " +productId + productDto;
    }

    @PostMapping("/products")
    public String addNewProduct(@RequestBody ProductDtos productDto){
        return "Adding new product " + productDto;

    }

    @PutMapping("/products/{productId}")
    public String updateProduct(@PathVariable("productId") Long productId,@RequestBody ProductDtos productDto){
        return "Updating product with id: "+ productId + productDto;
    }

    @DeleteMapping("/products/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId,@RequestBody ProductDtos productDto){
        return "deleting product with id: " + productId + productDto;
    }

}
