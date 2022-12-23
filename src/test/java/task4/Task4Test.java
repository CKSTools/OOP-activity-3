package task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task4.ingredients.*;

import static org.junit.jupiter.api.Assertions.*;

public class Task4Test {



    @Test
    public void testPreparingToxicThrowsAnError()
    {
        RatPoison poison = new RatPoison();
        assertThrows(PoisonousIngredientException.class, poison::prepare);
        assertFalse(poison.isPrepared());
    }

    @Test
    public void testPreparingNonToxicDoesNotThrowAnError()
    {
        Thyme thyme = new Thyme();
        assertDoesNotThrow(thyme::prepare);
        assertTrue(thyme.isPrepared());
        Pasta pasta = new Pasta();
        assertDoesNotThrow(pasta::prepare);
        assertTrue(pasta.isPrepared());
        Tomato tomato = new Tomato();
        assertDoesNotThrow(tomato::prepare);
        assertTrue(tomato.isPrepared());
    }

    @Test
    public void testCookingGetsDone()
    {
        Recipe momsSpicyPasta = new Recipe();

        momsSpicyPasta.addIngredient(new Pasta());
        momsSpicyPasta.addIngredient(new Thyme());
        momsSpicyPasta.addIngredient(new RatPoison());
        momsSpicyPasta.addIngredient(new Tomato());

        Cooking cooking = new Cooking(momsSpicyPasta);
        assertFalse(cooking.isDone());
        assertDoesNotThrow(cooking::cook);
        assertTrue(cooking.isDone());
    }

    @Test
    public void testNonToxicIngredientsArePrepared() throws Exception
    {
        Recipe momsSpicyPasta = new Recipe();

        momsSpicyPasta.addIngredient(new Pasta());
        momsSpicyPasta.addIngredient(new Thyme());
        momsSpicyPasta.addIngredient(new RatPoison());
        momsSpicyPasta.addIngredient(new Tomato());

        Cooking cooking = new Cooking(momsSpicyPasta);
        cooking.cook();
        momsSpicyPasta.getIngredients().forEach(ingredient -> {
            assertEquals(!(ingredient instanceof IsPoisonous), ingredient.isPrepared());
        });
    }
}
