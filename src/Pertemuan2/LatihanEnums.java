package Pertemuan2;

enum Months {
    Januari,
    Februari,
    Maret,
    April,
    Mei,
    Juni,
    Juli,
    Agustus,
    September,
    Oktober,
    November,
    Desember,
}

public class LatihanEnums {
    public static void main(String[] args) {
        for(Months allmonths : Months.values()){
            System.out.println(allmonths);
        }
        System.out.println();
        System.out.println(Months.November);
    } 
}
 