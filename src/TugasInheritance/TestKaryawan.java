import java.util.Scanner;

class TestKaryawan {
    private static int input;
    private static String id, nama, alamat;
    public static void main(String[] args) {
        KaryawanTetap kt = new KaryawanTetap();
        KaryawanKontrak kk = new KaryawanKontrak();

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Apakah anda karyawan tetap atau kontrak?");
            System.out.println("[1] Karyawan tetap\n[2]Karyawan kontrak");
            System.out.print("=> ");
            input = scan.nextInt();
        } while (input < 1 && input > 2);
        
        if (input == 1) {
            System.out.print("Masukkan id Anda: ");
            scan.nextLine();
            id = scan.nextLine();
            System.out.print("Masukkan nama Anda: ");
            nama = scan.nextLine();
            System.out.print("Masukkan alamat Anda: ");
            alamat = scan.nextLine();
            kt.setId(id);
            kt.setNama(nama);
            kt.setAlamat(alamat);
            System.out.println("----------------------------");
            System.out.println("Nama\t: "+kt.getNama());
            System.out.println("Id\t: "+kt.getId());
            System.out.println("Alamat\t: "+kt.getAlamat());
            kt.hitungGaji();
        }
        else{
            System.out.print("Masukkan id Anda: ");
            scan.nextLine();
            id = scan.nextLine();
            System.out.print("Masukkan nama Anda: ");
            nama = scan.nextLine();
            System.out.print("Masukkan alamat Anda: ");
            alamat = scan.nextLine();
            kk.setId(id);
            kk.setNama(nama);
            kk.setAlamat(alamat);
            System.out.println("----------------------------");
            System.out.println("Nama\t: "+kk.getNama());
            System.out.println("Id\t: "+kk.getId());
            System.out.println("Alamat\t: "+kk.getAlamat());
            kk.hitungGaji();
        }
        scan.close();
    }
}