package com.example.Restaurantproject.Repository;

import com.example.Restaurantproject.Model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.print.attribute.HashAttributeSet;
import java.util.Map;

@Repository
public class RestaurantRepository {

    @Autowired
    Map<Integer, Restaurant> restaurantMap;

    public Map<Integer, Restaurant> getRestaurants() {
        return restaurantMap;
    }
}
