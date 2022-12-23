package task1.animals;

import task1.Animal;
import task1.NoSoundException;

public class Lizard extends Animal {
    @Override
    public String makeSound() throws NoSoundException {throw new NoSoundException();}
}
