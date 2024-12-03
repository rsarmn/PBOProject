package Keuangan;

// MetodeBayar Interface
public interface MetodeBayar {
    double BayarCash(double cash, double belanja);
    double BayarQRIS(int idUser, double saldo, double belanjaTotal);
    double BayarEwallet(int idUser, double saldo, double belanjaTotal);
    double BayarCreditCard(int idUser, double saldo, double belanjaTotal);
    double BayarDebitCard(int idUser, double saldo, double belanjaTotal);
}