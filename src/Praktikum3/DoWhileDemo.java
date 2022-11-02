package Praktikum3;

// Nama : Hafidh Muhammad Akbar
// NIM  : M0521026

public class DoWhileDemo {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        System.out.println("Menampilkan nilai array dengan perulangan for");
        for (int i = 0; i < 5; i++) {
            System.out.println("elemen ke-" + i + " = " + arr[i]);
        }

        System.out.println("\nMenampilkan nilai array dengan perulangan Do .. While");
        
        int a = 0;
        do{
            System.out.println("elemen ke-" + a + " = " + arr[a]);
            a++;
        }while(a < 5);
    }
}

// Melanjutkan source code Latihan3 yang sudah diperbaiki, ubahlah source code dengan 
// mengganti dari perulangan FOR menjadi menggunakan DO ... WHILE