package com.generics.meal_plan_generator;

public class VeganMeal implements MealPlan {
    private String name;

    public VeganMeal(String name) {
        this.name = name;
    }

    @Override
    public String getMealDetails() {
        return "Vegan Meal: " + name;
    }
}
