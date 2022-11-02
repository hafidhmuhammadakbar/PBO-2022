package Pertemuan3;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        char nilai;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input Nilai Anda (A - E): ");
        nilai = input.next().charAt(0);
        
        if (nilai == 'A') {
            System.out.println("Pertahankan!");
        }
        else if (nilai == 'B') {
            System.out.println("Harus lebih baik lagi");
        }
        else if (nilai == 'C') {
            System.out.println("Perbanyak belajar");
        } 
        else if (nilai == 'D') {
            System.out.println("Jangan keseringan main");
        } 
        else if (nilai == 'E') {
            System.out.println("Kebanyakan bolos...");
        } 
        else {
            System.out.println("Maaf, format nilai tidak sesuai");
        }
        
        input.close();
    }
}
