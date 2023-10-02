package com.example.tarunapi.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BaseModel {
    private Long id;
    private Date createdAT;
    private Date lastUpdatedAt;

}
