package Praktikum2;

public class LatihanLong {
    public static void main(String args[]) {
        
        //kode yang salah
        // long p = 2_147_483_648;
        // System.out.println(p);

        //kode yang benar
        long p = 2_147_483_648L;
        System.out.println(p);
    }
}

/*
    Mengapa kode di atas salah?
    Karena secara default pada bahasa java bilangan bulat dianggap integer. 
    Oleh karena itu, kita perlu memberikan akhiran huruf 'L' untuk 
    menyatakan bahwa itu merupakan tipe data long.

    Hal ini juga berlaku di tipe data float dan double. secara default, angka pecahan pada
    bahasa Java dianggap sebagai double. Oleh karena itu, kita perlu memberikan akhiran 
    huruf 'F' untuk menyatakan bahwa itu merupakan tipe data float 

    Contoh :

    float num1 = 3.14f;
    double num2 = 3.14;
 */
