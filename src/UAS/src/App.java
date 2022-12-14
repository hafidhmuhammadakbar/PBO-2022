// Class App
public class App{

    public static void main(String[] args) throws Exception {
        // Array yang berisi PegawaiTetap
        PegawaiTetap[] arrayPegawaiTetap = new PegawaiTetap[5];
        // Array yang berisi PegawaiHonorer
        PegawaiHonorer[] arrayPegawaiHonorer = new PegawaiHonorer[5];
        arrayPegawaiTetap[0] = new PegawaiTetap(1, "Abdi Santyatmoko", "Surakarta", 4_000_000, 1_500_000);
        arrayPegawaiTetap[1] = new PegawaiTetap(2, "Adeline Felita Marwa", "Bekasi", 3_500_000, 1_500_000);
        arrayPegawaiTetap[2] = new PegawaiTetap(3, "Adi Prasetya", "Lampung", 5_000_000, 2_500_000);
        arrayPegawaiTetap[3] = new PegawaiTetap(4, "Aditya Nugraha", "Pacitan", 5_500_000, 2_000_000);
        arrayPegawaiTetap[4] = new PegawaiTetap(5, "Aisyah Hayya Imani", "Yogyakarta", 4_000_000, 1_500_000);
        
        arrayPegawaiHonorer[0] = new PegawaiHonorer(11, "Afif Nur Fauzi", "Sragen", 4_000_000);
        arrayPegawaiHonorer[1] = new PegawaiHonorer(12, "Alfiki Diastama", "Sukoharjo", 3_000_000);
        arrayPegawaiHonorer[2] = new PegawaiHonorer(13, "Andika Kavin", "Surakarta", 3_500_000);
        arrayPegawaiHonorer[3] = new PegawaiHonorer(14, "Asyahra Rahmasari", "Surakarta", 3_500_000);
        arrayPegawaiHonorer[4] = new PegawaiHonorer(15, "Beatrix Datu Sarira", "Toraja", 3_000_000);
        
        ThreadPrint t1 = new ThreadPrint(arrayPegawaiTetap);
        ThreadPrint t2 = new ThreadPrint(arrayPegawaiHonorer);
        t1.start(); 
        t2.start(); 
    }
}
