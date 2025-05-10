package example.animalControl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a zoo and some animals
        Zoo zoo = new Zoo();

        // Add animals to the zoo
        Animal dog = new Dog("Chó Mực");
        Animal cat = new Cat("Mèo Tí");
        Animal bird = new Bird("Chim Chíp");

        zoo.addAnimal(dog);
        zoo.addAnimal(cat);
        zoo.addAnimal(bird);

        // Print sound and movement of each animal
        System.out.println("Tiếng kêu và hành động của từng con vật:");
        zoo.makeAllAnimalsSoundAndMove();

        // Print the number of each type of animal
        System.out.println("\nThống kê số lượng mỗi loài:");
        zoo.printAnimalCount();
    }
}
