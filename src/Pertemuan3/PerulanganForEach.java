package Pertemuan3;

public class PerulanganForEach {
    
    public static void main(String[] args) {
        // membuat array
        int angka[] = {3,1,42,24,12};
        // menggunakan perulangan For each untuk menampilkan angka
        for( int x : angka ){
            System.out.print(x + " ");
        }
        
        System.out.println("\n......");
        
        String nama[] = {"Abdi", "Kavin", "Adit", "Afif", "Bram", "Hafidh"};
        for( String i : nama ){
            System.out.print(i + " ");
        }
    }
}
