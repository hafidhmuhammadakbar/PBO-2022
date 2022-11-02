package Praktikum3;

public class NestedIf {
    
    public static void main(String[] args) {
        double IPK = 3.5;
        int PENGHASILAN_ORTU = 2000_000;
        if (IPK > 3.25) {
            System.out.println("IPK tinggi");
            
            if (PENGHASILAN_ORTU > 5000_000) {
                System.out.println("Mendapatkan bantuan dana pendidikan sebesar 1 kali gaji orang tua");
            }
            else {
                System.out.println("Mendapatkan bantuan dana pendidikan penuh selama kuliah");
            }
        }
        else if (IPK > 2.75 && IPK <= 3.25) {
            System.out.println("IPK cukup");
        }
        else {
            System.out.println("IPK rendah");
        }
    }
}
