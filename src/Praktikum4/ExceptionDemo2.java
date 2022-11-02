package Praktikum4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2;
        boolean lanjut = true;
        while (lanjut) {
            try {
                System.out.print("Ketik bilangan pertama : ");
                bil1 = sc.nextInt();
                System.out.print("Ketik bilangan kedua : ");
                bil2 = sc.nextInt();
                // double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
                // Mengganti tipe data dari hasil karena tipe data double dapat
                // menyebabkan terjalannya pembagian dengan 0
                int hasil = bil1 / bil2;
                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            }
            catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            } 
            // Tambahkan catch statement tambahan di sini
            catch(ArithmeticException e){
                System.out.println("Tidak bisa membagi dengan 0");
            }
        }

        sc.close();
    }
}

// Pembagian bilangan dengan 0 seharusnya tidak dapat dilakukan. Tambahkan catch statement
// tambahan untuk menangani pembagian dengan 0 pada source code tersebut!
/*
    Menambahkan catch ArithmeticException dan mengganti tipe data dari hasil ke int
    karena tipe data double bisa melakukan pembagian dengan 0 
*/
