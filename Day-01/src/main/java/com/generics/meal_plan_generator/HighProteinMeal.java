package com.generics.meal_plan_generator;

public class HighProteinMeal implements MealPlan {
    private String name;

    public HighProteinMeal(String name) {
        this.name = name;
    }

    @Override
    public String getMealDetails() {
        return "High Protein Meal: " + name;
    }
}
