package Pertemuan4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            int num1 = scan.nextInt();
            scan.close();
            if (num1 < 0){
                throw new Exception("No negative!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid entry!");
        } catch (Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}

/* 
    Jika kita menginputkan nilai "a12", maka output yang muncul adalah 
    "Invalid entry!"
*/