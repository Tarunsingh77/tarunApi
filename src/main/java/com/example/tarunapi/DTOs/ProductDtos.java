package com.example.tarunapi.DTOs;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDtos {
    private String title;
    private double price;
    private String description;
    private String Image;
    private String Category;
}
