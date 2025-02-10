package com.generics.meal_plan_generator;

public class KetoDietPlan implements MealPlan {
    private String name;

    public KetoDietPlan(String name) {
        this.name = name;
    }

    public String getMealDetails() {
        return "Keto Diet Plan: " + name;
    }
}