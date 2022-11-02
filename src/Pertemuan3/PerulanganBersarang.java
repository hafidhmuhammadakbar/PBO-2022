package Pertemuan3;

public class PerulanganBersarang {
    
    public static void main(String[] args) {
        // membuat variabel
        int x, y;
        // melakukan parulang sebnayan x dan y kali
        for (x = 0; x <= 5; x++){
            for( y = 0; y <= 3; y++){
                System.out.format("Perulangan [x=%d, y=%d] %n", x, y);
            }
            System.out.println("\n......");
        }
    }
}
