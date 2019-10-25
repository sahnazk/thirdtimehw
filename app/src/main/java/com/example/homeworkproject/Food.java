package com.example.homeworkproject;

public class Food {
    //our identfier for each food item
    private int FoodID;

    private String foodTitle;
    private String description;
    private double price;
    private int quantity;
    private int imageDrawableId;
    public Food(int foodID, String foodTitle, String description, double price) {
        FoodID = foodID;
        this.foodTitle = foodTitle;
        this.description = description;
        this.price = price;

    }

    public int getFoodID() {
        return FoodID;
    }

    public void setFoodID(int foodID) {
        FoodID = foodID;
    }

    public String getFoodTitle() {
        return foodTitle;
    }

    public void setFoodTitle(String foodTitle) {
        this.foodTitle = foodTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
