package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Task1Test {

    public Class<?> createLizardInstance() {
        try {
            return Class.forName("task1.animals.Lizard");
        } catch (ClassNotFoundException e) {
            fail("The Lizard class does not exist in the task1.animal package");
        }
        return null;
    }

    public Class<?> createPigInstance() {
        try {
            return Class.forName("task1.animals.Pig");
        } catch (ClassNotFoundException e) {
            fail("The Pig class does not exist in the task1.animal package");
        }
        return null;
    }

    @Test
    public void testPigSaysOink() {
        try {
            Animal animal = (Animal) createPigInstance().getConstructor().newInstance();
            assertEquals("Oink", animal.makeSound());
        } catch (ClassCastException e) {
            fail("Pig couldn't not cast to the Animal class, are you extending it?");
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testLizardThrowsNoSoundException() {
        Animal animal = null;
        try {
            animal = (Animal) createLizardInstance().getConstructor().newInstance();
        } catch (ClassCastException e) {
            fail("Lizard couldn't not be cast to the Animal class, are you extending it?");
        } catch (Exception e) {
            fail(e.getMessage());
        }
        assertThrows(NoSoundException.class, animal::makeSound);
    }
}
