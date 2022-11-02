package Praktikum2;

public class Karyawan1 {
    String ID, nama, divisi;
    double gaji;

    //constructor kelas karyawan
    Karyawan1() {
        ID = "k001";
        nama = "Budi";
        divisi = "Produksi";
        gaji = 1750000;
    }
    
    void cetakData() {
        System.out.println("Data Karyawan :");
        System.out.println("ID : " + ID);
        System.out.println("Nama : " + nama);
        System.out.println("Divisi : " + divisi);
        System.out.println("Gaji : " + gaji);
    }
    
    double hitungSumbanganZakat() {
        double zakat = gaji * 0.025;
        return zakat;
    }
    
    public static void main(String[] args) {
        Karyawan1 karyawan1 = new Karyawan1();
        karyawan1.cetakData();
        System.out.println("Sumbangan zakat : Rp." +karyawan1.hitungSumbanganZakat());
    }    
}
