package Pertemuan3;

import java.util.Scanner;

public class LatihanKonversiNilai {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Program konversi nilai skala 100 ke skala huruf");
        System.out.print("Silakan masukkan nilai : ");
        int nilai = scan.nextInt();

        if(nilai < 55){
            System.out.println("Nilai Anda E");
        }
        else if(nilai < 60){
            System.out.println("Nilai Anda D");
        }
        else if(nilai < 65){
            System.out.println("Nilai Anda C");
        }
        else if(nilai < 70){
            System.out.println("Nilai Anda C+");
        }
        else if(nilai < 75){
            System.out.println("Nilai Anda B");
        }
        else if(nilai < 80){
            System.out.println("Nilai Anda B+");
        }
        else if(nilai < 85){
            System.out.println("Nilai Anda A-");
        }
        else{
            System.out.println("Nilai Anda A");
        }
        scan.close();
    }
}
