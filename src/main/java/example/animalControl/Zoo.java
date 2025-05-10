package example.animalControl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    private HashMap<String, Integer> animalCount = new HashMap<>();

    // Method to add animals
    public void addAnimal(Animal animal) {
        animals.add(animal);
        String className = animal.getClass().getSimpleName();
        animalCount.put(className, animalCount.getOrDefault(className, 0) + 1);
    }

    // Method to make all animals make sound and move
    public void makeAllAnimalsSoundAndMove() {
        for (Animal animal : animals) {
            animal.makeSound();
            animal.move();
        }
    }

    // Method to print the count of each animal type
    public void printAnimalCount() {
        for (String className : animalCount.keySet()) {
            System.out.println(className + ": " + animalCount.get(className));
        }
    }
}

