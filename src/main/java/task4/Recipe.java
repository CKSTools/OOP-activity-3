package task4;

import task4.ingredients.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<Ingredient> ingredients = new ArrayList<>();

    public void addIngredient(Ingredient ingredient)
    {
        ingredients.add(ingredient);
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}
