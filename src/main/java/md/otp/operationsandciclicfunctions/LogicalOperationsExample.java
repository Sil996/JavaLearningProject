package md.otp.operationsandciclicfunctions;

public class LogicalOperationsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean result = a && b;
        System.out.println("Logic and: " + result);

        //a = true
        a = result && b;
        //a = false
        System.out.println("logic and: " + a);

        //result = false
        result = a || b;
        //result = false
        System.out.println("logic or: " + result);

        System.out.println("Negation: " + !!!result);
    }
}
