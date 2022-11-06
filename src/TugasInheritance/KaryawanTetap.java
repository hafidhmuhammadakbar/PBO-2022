class KaryawanTetap extends Karyawan {
    private double gajiPokok = 3_500_000;
    private double uangMakan = 1_000_000;
    private double tunjangan = 1_000_000;

    public void hitungGaji(){
        double gajiTotal = gajiPokok+uangMakan+tunjangan;
        
        System.out.println("Total gaji yang didapat karyawan tetap: Rp."+gajiTotal);
    }
}
