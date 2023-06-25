# Restaurant Project
## Frameworks and languages used
###### SpringBoot

## Data Flow

### Controller
###### Map<Integer, Restaurant> getAllRestaurants() --> get all Restaurant ,String addRestaurant ---> add the Restaurant , String addMultipleRestaurants --> add multiple Restaurants ,Restaurant getRestaurantById(id) -->get Restaurant by id , String updateRestaurant(id,specialty) --> update Restaurant by id with specialty variable , String deleteRestaurant(id) --> delete the Restaurant by id

### Service
###### it is autowired in Controller so that it can perform required business logic

### Repository
###### It Consists data which is posted from postman Application. It is autowired in Service application

### Model
###### private int restaurantId;private String restaurantName;private String address;private long number;private String specialty;private int totalStaff;

### Factory
###### BeanFactory class it will initialize object by spring

## Summary
###### Performing crud operations(Add,Update,Delete,Read) on Restaurant Project.