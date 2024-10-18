package md.otp.classandobjectsautoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {

        Car car0001 = new Car("Q5", "Audi", "Black", "SIL 996");
        Car car0002 = new Car("508", "Peogeout", "Gray", "SIL 999");

        System.out.println(car0001.make + " " + car0001.model + " " + car0001.color + " " + car0001.plateNumber);

        Car car0003 = new Car("BMW", "X5", "White", "BOS 01", 854121);
        Car car0004 = new Car("BMW", "X5", "White", "BOS 02", 124541);

        Tool tool0001 = new Tool("Hammer", 2);
        System.out.println("The name of the tool is " + tool0001.name + " and its weight" + tool0001.weight);


        Garage garage0001 = new Garage();
        System.out.println(garage0001.name + " on adress:" + garage0001.adress);
        garage0001.name = "Auto-Detailing";
        System.out.println(garage0001.name + " on adress:" + garage0001.adress);
        garage0001.name = "Stefan cel Mare 1";
        System.out.println(garage0001.name + " on adress:" + garage0001.adress);

        Worker worker0001 = new Worker();
        System.out.println(worker0001.name);
        worker0001.name = "George";
        worker0001.salary = 5;
        worker0001.age = 18;
        System.out.println(worker0001.name);
        System.out.println(worker0001.age);
        System.out.println(worker0001.name);


    }
}
