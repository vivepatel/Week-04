package com.generics.meal_plan_generator;

public class MealPlanGeneratorMain {
    public static void main(String[] args) {

        VegetarianMeal vegetarianMeal = new VegetarianMeal("Vegetarian Paneer");
        VeganMeal veganMeal = new VeganMeal("Vegan Tofu");
        KetoDietPlan ketoMeal = new KetoDietPlan("Keto Chicken Salad");
        HighProteinMeal highProteinMeal = new HighProteinMeal("Grilled Chicken");


        Meal<VegetarianMeal> vegetarianMealPlan = MealPlanGenerator.generateMealPlan(vegetarianMeal);
        Meal<VeganMeal> veganMealPlan = MealPlanGenerator.generateMealPlan(veganMeal);
        Meal<KetoDietPlan> ketoMealPlan = MealPlanGenerator.generateMealPlan(ketoMeal);
        Meal<HighProteinMeal> highProteinMealPlan = MealPlanGenerator.generateMealPlan(highProteinMeal);
        System.out.println("\nGenerated Meal Plans:");
        vegetarianMealPlan.displayMealDetails();
        veganMealPlan.displayMealDetails();
        ketoMealPlan.displayMealDetails();
        highProteinMealPlan.displayMealDetails();
    }
}

