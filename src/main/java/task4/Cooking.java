package task4;

import task4.ingredients.Ingredient;
import task4.ingredients.PoisonousIngredientException;

public class Cooking {

    private boolean isDone = false;
    private Recipe recipe;

    public Cooking(Recipe recipe) {
        this.recipe = recipe;
    }

    public void cook() {
        for (Ingredient ingredient : recipe.getIngredients()) {
            try {
                ingredient.prepare();
            } catch (PoisonousIngredientException e) {
                System.out.println(ingredient + " is poisonous skip this.");
            }
        }
        isDone = true;
    }

    public boolean isDone() {
        return isDone;
    }

    public Recipe getRecipe() {
        return recipe;
    }
}
