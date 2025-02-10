package com.generics.meal_plan_generator;

public class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }

    public void displayMealDetails() {
        System.out.println(mealPlan.getMealDetails());
    }
}
