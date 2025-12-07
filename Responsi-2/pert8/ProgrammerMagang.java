public class ProgrammerMagang implements KaryawanKontrak, AksesSistem {
    private String nama;
    private double gajiPerJam;
    private String pinRahasia;
    private boolean sedangLogin;
    
    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;
        this.sedangLogin = false;
    }
    
    @Override
    public double hitungGaji(int jamKerja) {
        double totalGaji = jamKerja * gajiPerJam;
        System.out.printf("Gaji %s (%d jam) adalah: Rp %.1f%n", nama, jamKerja, totalGaji); [cite: 37, 60]
        return totalGaji;
    }
    
    @Override
    public void perpanjangKontrak(int durasiBulan) {
        System.out.println("Kontrak diperpanjang " + durasiBulan + " bulan."); [cite: 6, 65]
    }
    
    @Override
    public String getStatusCuti() {
        return "Tersedia 5 hari"; [cite: 7, 43, 61]
    }
    
    @Override
    public void login(String pin) {
        if (pin.equals(pinRahasia)) {
            sedangLogin = true; [cite: 9]
            System.out.println("Login Berhasil. Selamat datang, " + nama + "!"); [cite: 9, 63]
        } else {
            System.out.println("Login Gagal: PIN salah."); [cite: 10, 39, 62]
        }
    }
    
    @Override
    public void logout() {
        sedangLogin = false; [cite: 11]
        System.out.println(nama + " berhasil logout."); [cite: 11, 66]
    }
    
    @Override
    public String getRoleAkses() {
        return "Magang IT"; [cite: 12, 42, 64]
    }
}
