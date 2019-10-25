package com.example.homeworkproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FoodDatabase {

    public static Food getFoodById(int foodID){return foods.get(foodID);}

    public static ArrayList<Food> getAllFoods() {
        return new ArrayList<>(Food)((List Arrays.asList(foods.values().toArray()));
    }


    private static final HashMap<Integer, Food> foods = new HashMap<>();

    static {
        foods.put(1, new Food(
                1,
                "Bopper",
                "\"A classic flame-grilled burger, with a fresh Beef Patty",
                4.95



        ));

       foods.put(2, new Food(
               2,
               "Double Bopper",
               "Our classic Bopper reimagined with double the flame grilled-patty to fill your hunger",
               6
       ));

       foods.put(3, new Food(
               3,
               "Chicken Burger",
               "Our Chicken Burger, with a crispy fresh chicken pattie filling",
               5.30
       ));

       foods.put(4, new Food(
               4,
               "Veggie Burger",
               "A nice crunchy and healthy burger. 100% Vegan! With a fresh vegan pattie!",
               4.95
       ));

       foods.put(5, new Food(
               5,
               "Cheeseburger",
               " Fresh Beef patty topped with cheese, served on a freshly toasted sesame seed bun.",
               2.50
       ));

       foods.put(6, new Food(
               6,
               "BBQ Cheeseburger",
               "Our cheeseburger, with a fresh Beef Patty, fillied with delicous BBQ sauce",
               2.50
       ));

       foods.put(7, new Food(
               7,
               "Lamb Burger",
               "A fresh, healthy, grilled Burger with a delicous Lamb Patty",
               5.30
       ));

       foods.put(8, new Food(
               8,
               "Fish Burger",
               "A healthy, fresh burger filled with freshly grilled Salmon ",
               5.00
       ));

       foods.put(9, new Food(
               9,
               "Angus Burger",
               "Our premium burger, filled with a juicy Angus Beef Patty",
               6.30

       ));

       foods.put(10, new Food(
               10,
               "Sausage BopMuffin",
               "Enjoy Breakfast, with a fresh flame-grilled Sausage Patty on a warm toasted BopMuffin",
               3.00
       ));

       foods.put(11, new Food(
               11,
               "Sausage n Egg BopMuffin",
               "Enjoy breakfast, with a fresh flame-grilled Sausage Patty, with a warm crackled egg on a toasty BopMuffin",
               3.50
       ));

       foods.put(12, new Food(
               12,
               "Chips",
               "Freshly made, crisped deep fried chips",
               2.50
       ));

       foods.put(13, new Food(
               13,
               "Water",
               "Refresh yourself with a nice cold bottle of water",
               2.00
       ));

       foods.put(14, new Food(
               14,
               "Mountain Dew",
               "Refresh yourself with a nice cold bottle of Mountain Dew",
               2.20
       ));

       foods.put(15, new Food(
               15,
               "Fanta",
               "Refresh yourself with a nice cold bottle of Fanta",
               2.20
       ));


    }
}
