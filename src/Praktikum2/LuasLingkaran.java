package Praktikum2;

import javax.swing.JOptionPane;

public class LuasLingkaran {
    public static void main(String[] args) {
        
        final double PI = 3.14159;
        
        int jari2;
        double luas;
        jari2 = 7;
        
        luas = PI * jari2 * jari2;

        JOptionPane.showMessageDialog(null, "Jari-jari lingkaran = " + jari2 + "\nLuas lingkaran = " + luas,"Menghitung Luas", JOptionPane.INFORMATION_MESSAGE);
        
        // Mengakhiri program yang menampilkan GUI
        System.exit(0);
        }
}
