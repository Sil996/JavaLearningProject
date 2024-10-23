package md.otp.peopleevidence;

public class Person {

    public static boolean isHuman = true;

    public String firstname;

    protected String lastname;

    public final int ID;

    private int age;

    public boolean isRetired;


    public Person(String firstname, String lastname, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ID = id;
    }


    public Person(String firstname, String lastname, int id, int age, boolean isRetired) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ID = id;
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("The entered age is not valid, the property age is still empty");

        }
        this.isRetired = isRetired;
    }


    public int getAge() {
        return this.age;
    }

    public void printRetirementStatus() {
        if (isRetired) {

            System.out.println(firstname + " este la pensie");
        } else {

            System.out.println(firstname + " nu este la pensie");
        }
    }
}
