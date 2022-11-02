package Pertemuan4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CekBilangan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bil;
        boolean pivot = true;

        System.out.println("Program cek bilangan genap dan ganjil");
        while(pivot){
            try{
                System.out.print("Silakan masukkan bilangan : ");
                bil = scan.nextInt();

                if(bil % 2 == 0){
                    System.out.println(bil+" adalah bilangan genap");
                }
                else{
                    System.out.println(bil+" adalah bilangan ganjil");
                }
                pivot = false;
            }
            catch(InputMismatchException e){
                scan.next();
                System.out.println("Input salah!");
            }
        }
        scan.close();
    }
}
