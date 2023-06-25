package com.example.Restaurantproject.Service;

import com.example.Restaurantproject.Model.Restaurant;
import com.example.Restaurantproject.Repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepository restaurantRepository;
    public Map<Integer, Restaurant> getAllRestaurants() {
        return restaurantRepository.getRestaurants();
    }

    public String addRestaurant(Restaurant restaurant) {
        Map<Integer,Restaurant> restaurantMap = getAllRestaurants();
        restaurantMap.put(restaurant.getRestaurantId(),restaurant);
        return "Restaurant Added Successfully!";
    }

    public Restaurant getRestaurantById(int id) {
        Map<Integer,Restaurant> restaurantMap = getAllRestaurants();
        return restaurantMap.getOrDefault(id,null);
    }

    public String addMultipleRestaurants(List<Restaurant> restaurants) {
        Map<Integer,Restaurant> restaurantMap = getAllRestaurants();
        for(Restaurant restaurantObj : restaurants){
            restaurantMap.put(restaurantObj.getRestaurantId(),restaurantObj);
        }
        return "Restaurants Added!";
    }

    public String deleteRestaurant(int id) {
        Map<Integer,Restaurant> restaurantMap = getAllRestaurants();
        if(restaurantMap.containsKey(id)){
            restaurantMap.remove(id);
            return "Restaurant Deleted with Id : "+id;
        }
        else{
            return "Restaurant Not Found with Id : "+id;
        }
    }

    public String updateRestaurant(String specialty,int id) {
        Map<Integer,Restaurant> restaurantMap = getAllRestaurants();
        if(restaurantMap.containsKey(id)){
            restaurantMap.get(id).setSpecialty(specialty);
            return "Restaurant Updated with Id : "+id;
        }
        else{
            return "Restaurant Not Found with Id : "+id;
        }
    }
}
