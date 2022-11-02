package Praktikum2;

public class LatihanVariabel {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.0;
        float c = 4.3f;

        double aKonversi = Double.valueOf(a);
        double cKonversi = Double.valueOf(c);

        double sum = aKonversi + b + cKonversi;


        System.out.printf("Jumlah dari penjumlahan dari ketiga angka tersebut adalah : %.2f\n\n", sum);
    }
}
