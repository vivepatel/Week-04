import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.generics.meal_plan_generator.*;
public class MealPlanGeneratorTest {

    @Test
    public void testGenerateMealPlanForVegetarian() {
        // Creating a sample vegetarian meal
        VegetarianMeal vegetarianMeal = new VegetarianMeal("Vegetable Stir Fry");

        Meal<VegetarianMeal> meal = MealPlanGenerator.generateMealPlan(vegetarianMeal);

        assertNotNull(meal);
        assertEquals("Vegetarian Meal: Vegetable Stir Fry", meal.getMealPlan().getMealDetails());
    }

    @Test
    public void testGenerateMealPlanForVegan() {
        // Creating a sample vegan meal
        VeganMeal veganMeal = new VeganMeal("Vegan Burrito");

        Meal<VeganMeal> meal = MealPlanGenerator.generateMealPlan(veganMeal);

        assertNotNull(meal);
        assertEquals("Vegan Meal: Vegan Burrito", meal.getMealPlan().getMealDetails());
    }


}
