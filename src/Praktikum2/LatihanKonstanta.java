package Praktikum2;

public class LatihanKonstanta {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";
    
    public static void main(String args[]) {
        //KURS_DOLLAR = 13500; // salah
        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
    }
}

/*
    PERTANYAAN 1
    Kode di atas salah karena konstanta dengan keyword final tidak bisa diubah tau diperbarui nilainya.

    PERTANYAAN 2
    Keyword static digunakan untuk mengakses member baik variabel ataupun method (prosedur atau fungsi) 
    pada class tertentu tanpa harus membuat suatu objek dari class itu.
    Dengan adanya perintah 'static', kita tidak perlu membuar objek di dalam kelas untuk memanggil variabel tsb.
 */