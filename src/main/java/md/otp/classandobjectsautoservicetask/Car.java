package md.otp.classandobjectsautoservicetask;

public class Car {

    String plateNumber;

    int kmWhenEnteredTheService;

    String color;

    String make;

    String model;

    public Car(String modelOfTheCar, String makeOfTheCar, String colorOfTheCar, String plateNumber) {
        color = colorOfTheCar;
        make = makeOfTheCar;
        model = modelOfTheCar;
        this.plateNumber = plateNumber;
    }

    public Car(String make, String model, String color, String plateNumber, int km) {
        this.make = make;
        this.model = model;
        this.plateNumber = plateNumber;
        kmWhenEnteredTheService = km;


    }


}
