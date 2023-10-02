package com.example.tarunapi.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class product extends BaseModel{
    private String title;
    private double price;
    private String description;
    private Category category;
    private String imgUrl;


}
