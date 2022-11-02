package Pertemuan9;

import java.io.Serializable;

public class Mahasiswa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	String nim, nama, alamat;
	char jenisKelamin;
	
	public Mahasiswa(String nim, String nama, 
			char jenisKelamin, String alamat) {
		this.nim = nim;
		this.nama = nama;
		this.jenisKelamin = jenisKelamin;
		this.alamat = alamat;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public char getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(char jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
}