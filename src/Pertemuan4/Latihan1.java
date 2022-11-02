package Pertemuan4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Latihan1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            int num1 = scan.nextInt();
            System.out.println("Input 1 accepted : "+num1);
            int num2 = scan.nextInt();
            System.out.println("Input 1 accepted : "+num2);

        } catch (InputMismatchException e) {
            System.out.println("Invalid entry!");
        }
        scan.close();
    }
}

/*
    Jika kita menginputkan "abc14" maka program akan menjalankan perintah "catch"
    Hal ini karena inputan tersebut tidak sesuai dengan format yang ditentukan, yaitu integer.
*/
