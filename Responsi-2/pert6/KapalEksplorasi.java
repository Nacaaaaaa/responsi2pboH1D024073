public class KapalEksplorasi extends KendaraanGalaksi {
    private int modulScan;

    KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
        super(namaKendaraan, kapasitasPenumpang);
        this.modulScan = modulScan;
    }

    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    public void jelajah(int jarak) {
        int konsumsi = jarak * 2;
        int energiSaatIni = getLevelEnergi();

        if (energiSaatIni >= konsumsi) {
            setLevelEnergi(energiSaatIni - konsumsi);
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        } else {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        int energiSaatIni = getLevelEnergi();
        int energiBaru = energiSaatIni + jumlah;
        
        if (energiBaru > 100) {
            energiBaru = 100;
        }

        setLevelEnergi(energiBaru);
        System.out.println("Pengisian energi berhasil. Energi saat ini: " + energiBaru + "%.");

    public void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + modulScan + ".");
    }
}
