// Nama : Hafidh Muhammad Akbar
// NIM  : M0521026

package Praktikum3;

public class ForLoopDemo {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        for (int i = 0; i < 5; i++) {
            System.out.println("elemen ke-" + i + " = " + arr[i]);
        }
    }
}

// Berikut ini adalah code untuk menampilkan elemen (anggota) sebuah array yang berupa bilangan
// integer, mulai dari elemen pertama hingga terakhir.

// Eksekusi source code tersebut dan jelaskan apakah penulisan kode perulangan dengan for pada code
// tersebut sudah tepat dan tuliskan perbaikan apabila diperlukan!

// Jawab:  Penulisan kode perulangan tersebut kurang tepat dan akan menyebabkan array tidak ditampilkan semua
// Untuk memperbaikinya bisa dengan cara mengubah nilai inisiasi awal 'i' menjadi 'i = 0' seperti berikut
// for (int i = 1; i < 5; i++) {
//     System.out.println("elemen ke-" + i + " = " + arr[i]);
// }

// atau bisa juga mengubah nilai yang dipanggil pada 'arr[i]' menjadi 'arr[i-1]' seperti berikut
// for (int i = 1; i < 6; i++) {
//     System.out.println("elemen ke-" + (i-1) + " = " + arr[i-1]);
// }
