package Pertemuan4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        Boolean pivot = true;
        while(pivot){
            try {
                System.out.print("Enter input : ");
                num1 = scan.nextInt();

                pivot = false;
                System.out.println("Input 1 accepted : "+num1);

            } catch (InputMismatchException e) {
                scan.next();
                System.out.println("Invalid entry!");
            }
        }
        scan.close();
    }
}
