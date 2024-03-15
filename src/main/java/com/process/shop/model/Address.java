package com.process.shop.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {

    private String street;
    private String avenue;
    private String postalCode;
    private String neighborhood;

}
