public interface PaymentMethod {
    String processPayment(double nominal);
    String getPaymentDetails();
    double getTransactionFee();
    double getBalance();
}
