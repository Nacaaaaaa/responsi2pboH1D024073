public class EWalletPayment implements PaymentMethod {

    private String namaLayanan;
    private double saldoPengguna;
    private double nominalPembayaran;
    private final double TRANSACTION_FEE = 2000.0;

    public EWalletPayment(String namaLayanan, double saldoAwal, double nominalPembayaran) {
        this.namaLayanan = namaLayanan;
        this.saldoPengguna = saldoAwal;
        this.nominalPembayaran = nominalPembayaran;
    }

    @Override
    public String processPayment(double nominal) {
        double totalDibayar = nominal + TRANSACTION_FEE;
        
        if (saldoPengguna >= totalDibayar) {
            saldoPengguna -= totalDibayar;
            return "Pembayaran berhasil!";
        } else {
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaLayanan;
    }

    @Override
    public double getTransactionFee() {
        return TRANSACTION_FEE;
    }

    @Override
    public double getBalance() {
        return saldoPengguna;
    }
}
