class Customer {
    String nama;
    String noID;
    int totalBelanja;

    Customer(String nama, String noID, int totalBelanja) {
        this.nama = nama;
        this.noID = noID;
        this.totalBelanja = totalBelanja;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama + " | ID: " + noID + " | Total Belanja: Rp " + totalBelanja);
    }
}
