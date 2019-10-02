package animals;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animals> animalCollection = new ArrayList<>();

        //new animals in collection
        //mammals
        animalCollection.add(new Mammals("Panda", 1869));
        animalCollection.add(new Mammals("Zebra", 1778));
        animalCollection.add(new Mammals("Koala", 1816));
        animalCollection.add(new Mammals("Sloth", 1804));
        animalCollection.add(new Mammals("Armadillo", 1758));
        animalCollection.add(new Mammals("Raccoon", 1758));
        animalCollection.add(new Mammals("Bigfoot", 2021));

        //birds
        animalCollection.add(new Birds("Pigeon", 1837));
        animalCollection.add(new Birds("Peacock", 1821));
        animalCollection.add(new Birds("Toucan", 1758));
        animalCollection.add(new Birds("Parrot", 1824));
        animalCollection.add(new Birds("Swan", 1758));

        //fish
        animalCollection.add(new Fish("Salmon", 1758));
        animalCollection.add(new Fish("Catfish", 1817));
        animalCollection.add(new Fish("Perch", 1758));

        //List all the animals in descending order by year named
        System.out.println("\n *** DISCOVERY YEAR ***");
        Collections.sort(animalCollection, (a1, a2) -> a2.yearDiscovered - a1.yearDiscovered);
        System.out.println(animalCollection);

        //List all the animals alphabetically
        System.out.println("\n *** NAME ***");
        Collections.sort(animalCollection, (a1, a2) -> a1.name.compareToIgnoreCase(a2.name));
        System.out.println(animalCollection);

        //List all the animals order by how they move
        System.out.println("\n*** ANIMALS BY MOVEMENT ***");
        Collections.sort(animalCollection, (a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animalCollection.forEach(animal -> System.out.println(animal.getName() + ": " + animal.move()));

         // only animals that breathe with lungs
        System.out.println("\n*** ANIMALS THAT BREATHE WITH LUNGS ***");
        animalCollection.forEach(animal -> {
            if (animal.breathe().equals("Lungs")) {
                System.out.println(animal.getName() + ": " + animal.breathe());
            }
        });

        // only animals that breathe with lungs and discovered in 1758
        System.out.println("\n*** ANIMALS THAT BREATE WITH LUNGS AND DISCOVERED 1758 ***");
        animalCollection.forEach(animal -> {
            if (animal.breathe().equals("Lungs") && animal.yearDiscovered == 1758) {
                System.out.println(animal.getName() + ": " + animal.breathe() + " " + animal.yearDiscovered);
            }
        });

        // only animals that lay eggs and breathe with lungs
        System.out.println("\n*** ANIMALS THAT LAY EGGS AND BREATHE WITH LUNGS ***");
        animalCollection.forEach(animal -> {
            if (animal.reproduce().equals("Eggs") && animal.breathe().equals("Lungs")) {
                System.out.println(animal.getName() + ": " + "Breathes with " + animal.breathe() + " "
                        + "and reproduces by" + " " + animal.reproduce());
            }
        });

        // only animals in 1758 alphabetically
        System.out.println("\n*** ALPHABETICAL ANIMALS NAMED IN 1758***");
        Collections.sort(animalCollection, (a1, a2) -> a1.name.compareToIgnoreCase(a2.name));
        animalCollection.forEach(animal -> {
            if (animal.yearDiscovered == 1758) {
                System.out.println(animal.getName());
                ;
            }
        });

        // only mammals alphabetically
        System.out.println("\n*** ALPHABETICAL MAMMALS ***");
        animalCollection.forEach(animal -> {
            if (animal instanceof Mammals) {
                System.out.println(animal);
            }
        });
    }
}
