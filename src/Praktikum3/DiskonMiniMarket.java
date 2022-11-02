package Praktikum3;

// Nama : Hafidh Muhammad Akbar
// NIM  : M0521026

import java.util.Scanner;

public class DiskonMiniMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total pembelian : Rp.");
        
        // tambahkan code untuk menyimpan nominal total pembelian
        double pembelian = sc.nextDouble();
        double diskon = 0.0;

        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        if(pembelian < 50000){
            diskon = 0.0;
        }
        else if(pembelian >= 50000 && pembelian < 75000){
            diskon = 0.05;
        }
        else if(pembelian >= 75000 && pembelian < 125000){
            diskon = 0.15;
        }
        else{
            diskon = 0.2;
        }

        // tambahkan code untuk menampilkan nominal yang harus dibayar
        double bayar = 0.0;
        
        bayar = pembelian - (pembelian * diskon);
        
        // sesuai dengan ketentuan diskon yang diberikan
        System.out.printf("Nominal yang harus Anda bayar adalah : Rp. %.2f\n", bayar);

        sc.close();
    }
}

// Seorang mahasiswa berbelanja di mini market. Mini market tersebut memberikan diskon kepada
// pembeli dengan ketentuan
// a. Diskon 0% jika total pembelian di bawah 50.000
// b. Diskon 5% jika total pembelian 50.000 hingga 75.000
// c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
// d. Diskon 20% jika total pembelian di atas 125.000