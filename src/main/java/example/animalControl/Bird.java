package example.animalControl;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " hót líu lo: 'Chíp chíp! Sáng nay trời đẹp quá ha!'");
    }

    @Override
    public void move() {
        System.out.println(getName() + " bay vòng vòng trên cao, thỉnh thoảng đáp xuống rỉa lông cho đẹp.");
    }
}


