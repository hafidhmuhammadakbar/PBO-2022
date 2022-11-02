package Pertemuan3;

import java.util.Scanner;

public class CekBilangan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Program cek bilangan genap dan ganjil");
        System.out.print("Silakan masukkan bilangan : ");
        int bil = scan.nextInt();

        if(bil % 2 == 0){
            System.out.println(bil+"adalah bilangan genap");
        }
        else{
            System.out.println(bil+" adalah bilangan ganjil");
        }
        scan.close();
    }
}
