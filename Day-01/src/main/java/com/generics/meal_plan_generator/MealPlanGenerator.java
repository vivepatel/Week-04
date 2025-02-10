package com.generics.meal_plan_generator;

public class MealPlanGenerator {
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan) {
        if (mealPlan == null) {
            throw new IllegalArgumentException("Meal plan cannot be null.");
        }

        return new Meal<>(mealPlan);
    }

}
