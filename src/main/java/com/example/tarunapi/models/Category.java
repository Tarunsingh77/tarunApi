package com.example.tarunapi.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter

public class Category {
    private String name;
    private String description;
    private List<product> products;

}
