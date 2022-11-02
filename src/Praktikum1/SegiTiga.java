package Praktikum1;

public class SegiTiga {
    int alas = 3;
    int tinggi = 4;
    int sisiMiring = 5;

    public Double hitungLuas() {
        Double luas = 0.0;
        luas = 0.5 * Double.valueOf(this.alas) * Double.valueOf(this.tinggi);
        return luas;
    }

    public Double hitungKeliling() {
        Double keliling = 0.0;
        keliling = Double.valueOf(this.alas) + Double.valueOf(this.tinggi) + Double.valueOf(this.sisiMiring);
        return keliling;
    }

    public static void main(String[] args) {
        SegiTiga segiTiga = new SegiTiga();
        System.out.println("alas : "+segiTiga.alas);
        System.out.println("tinggi : "+segiTiga.tinggi);
        System.out.println("sisi miring : "+segiTiga.sisiMiring);
        System.out.println("luas segitiga : "+segiTiga.hitungLuas());
        System.out.println("keliling segitiga : "+segiTiga.hitungKeliling());
    }
}
