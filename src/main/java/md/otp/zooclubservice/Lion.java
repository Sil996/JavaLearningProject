package md.otp.zooclubservice;

public class Lion extends Animal {

    public Lion(String nameOfTheLion, int age) {
        super(nameOfTheLion, age);
    }

    @Override
    public void eat() {
        System.out.println("Pure meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Hrrrrr");
    }
}
