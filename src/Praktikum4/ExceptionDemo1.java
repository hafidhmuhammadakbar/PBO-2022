package Praktikum4;

import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ketik bilangan pertama : ");
        int bil1 = sc.nextInt();

        System.out.print("Ketik bilangan kedua : ");
        int bil2 = sc.nextInt();
        
        double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
        System.out.println(bil1 + " / " + bil2 + " = " + hasil);

        sc.close();
    }
}
/* a. Ketik huruf misalnya f untuk input bilangan pertama kemudian tekan ENTER
 - Apakah program masih dapat dijalankan setelah user memasukkan f sebagai input untuk bilangan pertama?
 - Tulis output yang muncul!
 - Jelaskan maksud dari output tersebut! */
/*  JAWAB :
 - Program tidak bisa dijalankan
 - Output yang muncul adalah :
    Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        at java.base/java.util.Scanner.next(Scanner.java:1594)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        at PPBO_04_Latihan1.main(PPBO_04_Latihan1.java:10)
 - Terjadi kesalahan input atau input missmatch exception karena input nilai tidak sesuai dengan tipe data
*/

/* b. Pilih salah satu angka sebagai bilangan pertama misal 5, kemudian ketik angka 0 untuk input bilangan kedua. 
    Jelaskan output yang muncul!
 - Tulis output yang muncul!
 - Jelaskan maksud dari output tersebut! */
/*  JAWAB :
 - Output yang dihasilkan adalah : 5 / 0 = Infinity
 - Pada teori matematika, kita tidak bisa membagi sebuah bilangan dengan 0, tetapi pada bahasa java pembagian 
    dengan 0 pada tipe data double akan menghasilkan hasil "infinity" 
*/