package example.animalControl;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " kêu nhẹ nhàng: 'Meo~ meo~ nè, ai cho tui ăn chưa đó?'");
    }

    @Override
    public void move() {
        System.out.println(getName() + " bước nhẹ như gió, uốn éo lượn lờ như người mẫu miệt vườn.");
    }
}

