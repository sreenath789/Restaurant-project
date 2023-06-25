package com.example.Restaurantproject.Controller;

import com.example.Restaurantproject.Model.Restaurant;
import com.example.Restaurantproject.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("restaurant")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping("getAllRestaurants")
    public Map<Integer, Restaurant> getAllRestaurants(){
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("getRestaurantById/{id}")
    public Restaurant getRestaurantById(@PathVariable int id){
        return restaurantService.getRestaurantById(id);
    }

    @PostMapping("addRestaurant")
    public String addRestaurant(@RequestBody Restaurant restaurant){
        return restaurantService.addRestaurant(restaurant);
    }

    @PostMapping("addMultipleRestaurants")
    public String addMultipleRestaurants(@RequestBody List<Restaurant> restaurants){
        return restaurantService.addMultipleRestaurants(restaurants);
    }

    @PutMapping("updateRestaurant/{id}/{specialty}")
    public String updateRestaurant(@PathVariable int id,@PathVariable String specialty){
        return restaurantService.updateRestaurant(specialty,id);
    }

    @DeleteMapping("deleteRestaurant/{id}")
    public String deleteRestaurant(@PathVariable int id){
        return restaurantService.deleteRestaurant(id);
    }

}
