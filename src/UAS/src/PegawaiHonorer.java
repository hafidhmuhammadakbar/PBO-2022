// Class PegawaiHonorer
//      implements Class Pegawai, artinya dapat dapat meng-override 
//      method yang ada di Class Pegawai 
class PegawaiHonorer implements Pegawai{
    private int idPegawai;
    private String namaPegawai;
    private String alamatPegawai;
    private int gajiPokok;

    // Konstruktor
    public PegawaiHonorer(int idPegawai, String namaPegawai, String alamatPegawai, int gajiPokok) {
        this.idPegawai = idPegawai;
        this.namaPegawai = namaPegawai;
        this.alamatPegawai = alamatPegawai;
        this.gajiPokok = gajiPokok;
    }


    // Method Hitung gaji
    @Override
    public int hitungGaji() {
        int totalGaji = 0;
        totalGaji = gajiPokok;
        return totalGaji;
    }

    // Untuk melakukan print
    // Method toString mengembalikan representasi String dari Objek
    // Jika print Objek, maka java compiler akan memanggil method toString() pada Objek tsb.
    @Override
    public String toString() {
        String printPegawaiHonorer = "Pegawai Honorer\n"+
                        "\tId Pegawai       : "+idPegawai+
                        "\n\tNama Pegawai   : "+namaPegawai+
                        "\n\tAlamat Pegawai : "+alamatPegawai+
                        "\n\t Gaji Pokok    : "+gajiPokok+
                        "\n\tGaji Total     : "+hitungGaji();
        return printPegawaiHonorer;
    }

    // Getter and Setter
    public int getIdPegawai() {
        return idPegawai;
    }


    public void setIdPegawai(int idPegawai) {
        this.idPegawai = idPegawai;
    }


    public String getNamaPegawai() {
        return namaPegawai;
    }


    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }


    public String getAlamatPegawai() {
        return alamatPegawai;
    }


    public void setAlamatPegawai(String alamatPegawai) {
        this.alamatPegawai = alamatPegawai;
    }


    public int getGajiPokok() {
        return gajiPokok;
    }


    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
}