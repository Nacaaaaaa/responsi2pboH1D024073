public class PaymentTest {

    public static void main(String[] args) {
        double saldoAwal = 150000.0;
        double nominalTransaksi = 50000.0;
        String namaLayanan = "OVO";
        
        EWalletPayment eWallet = new EWalletPayment(namaLayanan, saldoAwal, nominalTransaksi);
        
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");
        System.out.printf("Saldo awal: %.0f%n", eWallet.getBalance());

        System.out.printf("Memproses pembayaran sebesar %.0f...%n", nominalTransaksi);
        String hasil = eWallet.processPayment(nominalTransaksi);
        System.out.println(hasil);
        
        if (hasil.equals("Pembayaran berhasil!")) {
            System.out.printf("Sisa saldo: %.0f%n", eWallet.getBalance());
            System.out.println("Detail Transaksi: " + eWallet.getPaymentDetails());
        }
        
    }
}
