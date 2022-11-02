package Pertemuan2;

public class LatihanArray {
    public static void main(String[] args){
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        System.out.println("Hari ini adalah hari " +hari[3]);
        System.out.println("\nBerikut merupakan urutan hari dalam seminggu :");
        //cara 1
        for(int i=0; i<7; i++){
            System.out.println(hari[i]);
        }
        //cara 2
        System.out.println("");
        for(String loop : hari){
            System.out.println(loop);
        }
    }
}
