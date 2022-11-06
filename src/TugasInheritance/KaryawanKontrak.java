class KaryawanKontrak extends Karyawan {
    private double gajiHarian = 100_000;
    private double jumlahHariMasuk = 25;

    public void hitungGaji(){
        double gajiTotal = gajiHarian * jumlahHariMasuk;
        
        System.out.println("Total gaji yang didapat karyawan kontrak: Rp."+gajiTotal);
    }
}