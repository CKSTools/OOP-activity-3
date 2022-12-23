package task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {

    @Test
    public void testDriversDataIsSavedToInstance()
    {
        Driver max = new Driver("Max Verstappen", 454);
        assertEquals("Max Verstappen", max.getName());
        assertEquals(454, max.getPoints());
    }

    @Test
    public void testDriverCanBeAdded()
    {
        ScoreBoard scoreBoard = new ScoreBoard();
        Driver max = new Driver("Max Verstappen", 454);
        scoreBoard.addDriver(max);
        assertEquals(1, scoreBoard.drivers().size());
        assertEquals(scoreBoard.drivers().get(0), max);
    }

    @Test
    public void testMultipleDriversCanBeAdded()
    {
        ScoreBoard scoreBoard = new ScoreBoard();
        scoreBoard.addDriver(new Driver("Max Verstappen", 454));
        Driver charles = new Driver("Charles Leclerc", 308);
        scoreBoard.addDriver(charles);
        assertEquals(2, scoreBoard.drivers().size());
        assertEquals(scoreBoard.drivers().get(1), charles);
    }

    @Test
    public void testDriversAreSortedAfterPoints()
    {
        ScoreBoard scoreBoard = new ScoreBoard();
        Driver valterri_bottas = new Driver("Valterri Bottas", 49);
        scoreBoard.addDriver(valterri_bottas);
        Driver george_russel = new Driver("George Russel", 275);
        scoreBoard.addDriver(george_russel);
        Driver pierre_gasly = new Driver("Pierre Gasly", 23);
        scoreBoard.addDriver(pierre_gasly);
        Driver sergio_perez = new Driver("Sergio Perez", 305);
        scoreBoard.addDriver(sergio_perez);
        Driver kevin_magnussen = new Driver("Kevin Magnussen", 25);
        scoreBoard.addDriver(kevin_magnussen);

        Collections.sort(scoreBoard.drivers());

        assertEquals(scoreBoard.drivers().get(0), sergio_perez);
        assertEquals(scoreBoard.drivers().get(1), george_russel);
        assertEquals(scoreBoard.drivers().get(2), valterri_bottas);
        assertEquals(scoreBoard.drivers().get(3), kevin_magnussen);
        assertEquals(scoreBoard.drivers().get(4), pierre_gasly);
    }
}
