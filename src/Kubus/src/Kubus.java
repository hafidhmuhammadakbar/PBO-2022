/**
 * Class Kubus adalah Class untuk bangun ruang Kubus
 * Dapat menghitung volume dan Luas Permukaan
*/
public class Kubus {
    /**
     * Method untuk menghitung volume kubus
     * @param sisi variabel yg mewakili sisi kubus
     * @return volume kubus dalam tipe data double
     */
   public double hitungVolume(double sisi){
        double volume = 0;
        volume = sisi * sisi * sisi;
        return volume; 
    }

    /**
     * Method untuk menghitung luas permukaan kubus
     * @param sisi variabel yg mewakili sisi kubus
     * @return luas kubus dalam tipe data double
     */
    public double hitungLuasPermukaan(double sisi){
        double luas = 0;
        luas = 6 * sisi * sisi;
        return luas;
    }

    /**
     * main method
     * @param args method main ya
    */
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        System.out.println("Volume kubus sisi 4 : "+kubus.hitungVolume(4));
        System.out.println("Luas permukaan kubus sisi 4 : "+kubus.hitungLuasPermukaan(4));
    }
}
