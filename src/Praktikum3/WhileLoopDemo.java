package Praktikum3;

// Nama : Hafidh Muhammad Akbar
// NIM  : M0521026

import java.util.concurrent.TimeUnit;

public class WhileLoopDemo {
    public static void main(String[] args) {
        int i = 3;
        while (true) {
            System.out.println("Hello ke-" + i);
            i+=3;

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception x) {
                x.printStackTrace();
            }
            if(i > 300){
                break;
            }
        }
    }
}

// Source code berikut ini akan menampilkan tulisan "Hello ke-" yang diulang-ulang sampai
// program diterminate secara manual oleh user.

// Ubahlah source code tersebut agar :
// - hanya menampilkan indeks bilangan kelipatan 3
// - berhenti setelah menampilkan output "Hello ke-300"

// ==> Output yang diharapkan:
// Hello ke-3
// Hello ke-6
// Hello ke-9
// ...
// ...
// Hello ke-300

// HINT: 
// - tekan ctrl + c (vscode) pada terminal untuk menghentikan paksa jalannya program
// - statemen TimeUnit.SECONDS.sleep(2) membuat jalannya program memiliki delay 2 detik,
//   kalian bisa memodifikasinya sementara untuk keperluan debugging

