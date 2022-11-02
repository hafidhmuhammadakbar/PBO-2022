package Pertemuan5;

public class Pattern5 {
    public static void main(String[] args) {
		String nomorTelepon = "085644777899";
		System.out.println(nomorTelepon.replaceAll("[0-9]", "*"));
		System.out.println(nomorTelepon.replaceAll("[1-9]", "*"));
		
		String nomorTelepon2 = "0271-876543";
		System.out.println(nomorTelepon2.replaceAll("[0-9]{4}-[0-9]{6}", "****-******"));
	}
}
