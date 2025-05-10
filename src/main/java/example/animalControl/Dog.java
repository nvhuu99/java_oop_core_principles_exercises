package example.animalControl;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " sủa lên vui vẻ: 'Gâu gâu! Tới đây chơi với Mực nè!'");
    }

    @Override
    public void move() {
        System.out.println(getName() + " chạy tung tăng, cái đuôi quẩy quẩy như quạt mo.");
    }
}
