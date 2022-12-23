package task4.ingredients;

public abstract class Ingredient {

    private boolean isPrepared = false;

    public void prepare() throws PoisonousIngredientException {
        if (this instanceof IsPoisonous) {
            throw new PoisonousIngredientException();
        }
        isPrepared = true;
    }

    public boolean isPrepared() {
        return isPrepared;
    }
}
