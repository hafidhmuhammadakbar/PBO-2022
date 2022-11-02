package Praktikum1;

import java.lang.Math;

public class Kubus {
    int sisiKubus = 5;

    public Double hitungVolume() {
        Double volume = Math.pow(Double.valueOf(this.sisiKubus), 3.0);
        return volume;
    }

    public Double hitungLuasPermukaan() {
        Double luasPermukaan = 6 * Math.pow(Double.valueOf(this.sisiKubus), 2.0);
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        System.out.println("sisi kubus : "+kubus.sisiKubus);
        System.out.println("volume kubus : "+kubus.hitungVolume());
        System.out.println("luas permukaan kubus : "+kubus.hitungLuasPermukaan());
    }
}
