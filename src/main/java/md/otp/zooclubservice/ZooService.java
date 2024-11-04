package md.otp.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        Animal cat001 = new Cat("Jessica", 5);
        Dog dog001 = new Dog("Rax", 12);
        Lion lion001 = new Lion("Baghira", 25);


        System.out.println(lion001.getAge());
        lion001.makeSound();
        cat001.makeSound();
        System.out.println(cat001.getName());
    }
}
