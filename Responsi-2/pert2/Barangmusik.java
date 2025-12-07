class BarangMusik {
    String kode;
    String nama;
    double harga;
    int stok;
    
    BarangMusik(String kodeBarang, String namaBarang) {
        kode = kodeBarang;
        nama = namaBarang;
        harga = 0.0;
        stok = 0;
    }
    
    BarangMusik(String kodeBarang, String namaBarang, double hargaBarang) {
        kode = kodeBarang;
        nama = namaBarang;
        harga = hargaBarang;
        stok = 0;
    }

    BarangMusik(String kodeBarang, String namaBarang, double hargaBarang, int stokBarang) {
        kode = kodeBarang;
        nama = namaBarang;
        harga = hargaBarang;
        stok = stokBarang;
    }

    void ubahHarga(double hargaBaru) {
        harga = hargaBaru;
    }
    
    void ubahHarga(double hargaBaru) {
        harga = hargaBaru;
    }

    void tampilInfo() {
        System.out.println("Alat musik " + nama + " | Kode: " + kode + " | Harga: Rp " + harga + " | Stok: " + stok + " unit");
    }
}
