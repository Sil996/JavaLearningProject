package md.otp.zooclubservice;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Bone meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Ham Ham");
    }
}
