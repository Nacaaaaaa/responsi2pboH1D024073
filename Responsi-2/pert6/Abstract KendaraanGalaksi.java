public abstract class KendaraanGalaksi {
    private String namaKendaraan;
    private int levelEnergi;
    private int kapasitasPenumpang;

    KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100; // levelEnergi default = 100.
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }
    public int getLevelEnergi() {
        return levelEnergi;
    }
    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public final void tampilStatus() {
        System.out.println(namaKendaraan + " | Energi: " + levelEnergi + "% | Kapasitas: " + kapasitasPenumpang + " awak");
    }

    public abstract void aktifkanMesin();
    public abstract void jelajah(int jarak);
    public abstract void isiEnergi(int jumlah);
    
    protected void setLevelEnergi(int levelEnergi) {
        this.levelEnergi = levelEnergi;
    }
}
