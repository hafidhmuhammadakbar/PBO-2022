package Praktikum2;

public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;

    // buatlah constructor untuk menginisiasi nilai dari variabel
    // nim, nama, jenisKelamin, alamat
    Mahasiswa(String inputNim, String inputNama, char inputJenisKelamin, String inputAlamat){
        this.nim = inputNim;
        this.nama = inputNama;
        this.jenisKelamin = inputJenisKelamin;
        this.alamat = inputAlamat;
    }

    void CetakMahasiswa(){
        System.out.println("Data Mahasiswa :");
        System.out.println("NIM : " +nim);
        System.out.println("Nama : " +nama);
        System.out.println("Jenis kelamin : " +jenisKelamin);
        System.out.println("Alamat : " +alamat);
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("M0501001", "Patrick Star", 'L', "Bikini Bottom");
        mhs.CetakMahasiswa();
    }
}
