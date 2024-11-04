package md.otp.zooclubservice;

public class Cat extends Animal {


    public Cat(String name, int age) {
        super(name, age);
    }


    @Override
    public void eat() {
        System.out.println("Fish");
    }

    @Override
    public String getName() {
        return "Bla Bla";
    }

    @Override
    public void makeSound() {
        System.out.println("Miau");
    }
}
