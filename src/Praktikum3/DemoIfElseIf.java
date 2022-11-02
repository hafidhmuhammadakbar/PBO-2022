package Praktikum3;

public class DemoIfElseIf {
    public static void main(String[] args) {
        double IPK = 3.1;
        if (IPK > 3.25) {
            System.out.println("IPK tinggi");
        }
        else if (IPK > 2.75 && IPK <= 3.25) {
            System.out.println("IPK cukup");
        }
        else {
            System.out.println("IPK rendah");
        }
    }
}
