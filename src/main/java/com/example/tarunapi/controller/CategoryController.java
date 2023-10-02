package com.example.tarunapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @GetMapping("/products/categories")
    public String getAllCategory(){
        return "gettting all Category";

    }

    @GetMapping("/products/categories/{categoryId}")
    public String getProductInCategory(@PathVariable("categoryId") Long categoryId){
        return "Get products in category";
    }
}
