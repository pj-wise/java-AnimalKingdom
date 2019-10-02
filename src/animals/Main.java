package animals;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animals> animalCollection = new ArrayList<>();

        //new animals in collection
        //mammals
        newAnimals.add(new Mammals("Panda", 1869));
        newAnimals.add(new Mammals("Zebra", 1778));
        newAnimals.add(new Mammals("Koala", 1816));
        newAnimals.add(new Mammals("Sloth", 1804));
        newAnimals.add(new Mammals("Armadillo", 1758));
        newAnimals.add(new Mammals("Raccoon", 1758));
        newAnimals.add(new Mammals("Bigfoot", 2021));

        //birds
        newAnimals.add(new Birds("Pigeon", 1837));
        newAnimals.add(new Birds("Peacock", 1821));
        newAnimals.add(new Birds("Toucan", 1758));
        newAnimals.add(new Birds("Parrot", 1824));
        newAnimals.add(new Birds("Swan", 1758));

        //fish
        newAnimals.add(new Fish("Salmon", 1758));
        newAnimals.add(new Fish("Catfish", 1817));
        newAnimals.add(new Fish("Perch", 1758));
    }
}