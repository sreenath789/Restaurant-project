package com.example.Restaurantproject.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    private int restaurantId;
    private String restaurantName;
    private String address;
    private long number;
    private String specialty;
    private int totalStaff;


}
