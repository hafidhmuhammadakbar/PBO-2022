package Pertemuan1;

import java.util.Scanner;

public class DataMahasiswa {
    //attribut
    String nama, nim, jenisKelamin, alamat;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DataMahasiswa dataMahasiswa = new DataMahasiswa();

        System.out.println("Silakan isi data-data berikut : ");
        System.out.print("Masukkan nama Anda : ");
        String isiNama = input.nextLine();
        System.out.print("Masukkan NIM Anda : ");
        String isiNIM = input.nextLine();
        System.out.print("Masukkan Jenis Kelamin Anda [L/P] : ");
        String isiJenisKelamin = input.nextLine();
        System.out.print("Masukkan kota alamat Anda : ");
        String isiAlamat = input.nextLine();
        input.close();

        dataMahasiswa.isiData(isiNama, isiNIM, isiJenisKelamin, isiAlamat);
        dataMahasiswa.printData();
    }

    void isiData(String nama, String nim, String jenisKelamin, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    void printData() {
        System.out.println("\nSelamat Datang!");
        System.out.println("Terima kasih sudah mengisi data");
        System.out.println("Nama : " +this.nama);
        System.out.println("NIM : " +this.nim);
        System.out.println("Jenis kelamin [L/P] : " +this.jenisKelamin);
        System.out.println("Alamat : " +this.alamat);
    }
}
