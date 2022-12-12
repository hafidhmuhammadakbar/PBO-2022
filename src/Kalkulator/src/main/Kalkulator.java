package main;
/**
 * Class Kalkulator adalah class untuk mengoperasikan 2 buah bilangan.
 * Bisa menjumlahkan, mengurangi, mengalikan, dan membagi.
 */
public class Kalkulator {
    /** 
     * method tambah untuk menjumlahkan 2 bilangan
     * @param a bilangan pertama yang dijumlahkan
     * @param b bilangan kedua yang dijumlahkan
     * @return variabel double hasil dari penjumlahan a dan b
    */
    public double tambah(double a, double b){
        double c = a+b;
        return c;
    }

    /** 
     * method tambah untuk mengurangkan 2 bilangan
     * @param a bilangan pertama
     * @param b bilangan kedua 
     * @return variabel double hasil dari a - b
    */
    public double kurang(double a, double b){
        double c = a-b;
        return c;
    }

    /** 
     * method tambah untuk mengalikan 2 bilangan
     * @param a bilangan pertama
     * @param b bilangan kedua 
     * @return variabel double hasil dari a * b
    */
    public double kali(double a, double b){
        double c = a*b;
        return c;
    }

    /** 
     * method tambah untuk membagi 2 bilangan
     * @param a bilangan pertama
     * @param b bilangan kedua 
     * @return variabel double hasil dari a / b
    */
    public double bagi(double a, double b){
        double c = a/b;
        return c;
    }

    public static void main(String[] args) throws Exception {
        Kalkulator kalkulator = new Kalkulator();
        System.out.println(kalkulator.tambah(2.0, 3.0));
    }
}
