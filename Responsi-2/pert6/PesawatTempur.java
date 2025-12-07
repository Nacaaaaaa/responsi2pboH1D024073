public class PesawatTempur extends KendaraanGalaksi {
    private int jumlahRudal;
    
    PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }

    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    @Override
    public void jelajah(int jarak) {
        int konsumsi = jarak * 3;
        int energiSaatIni = getLevelEnergi();

        if (energiSaatIni < konsumsi) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            setLevelEnergi(energiSaatIni - konsumsi);
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
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
        System.out.println("Peningkatan energi berhasil. Energi saat ini: " + energiBaru + "%.");
    }

    public void tembakRudal(int jumlah) {
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Rudal tidak cukup. Hanya tersedia " + jumlahRudal + " rudal.");
        }
    }
}
