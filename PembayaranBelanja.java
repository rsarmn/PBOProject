package Keuangan;

// PembayaranBelanja Class
public class PembayaranBelanja implements MetodeBayarPakaiAplikasi {
    private double kembalian;
    private double sisaSaldoEWallet;
    private double sisaSaldoCreditCard;
    private double sisaSaldoShopee;

    @Override
    public double BayarCash(double cash, double belanja) {
        kembalian = cash - belanja;
        return kembalian;
    }

    @Override
    public double BayarQRIS(int idUser, double saldo, double belanjaTotal) {
        return saldo - belanjaTotal;
    }

    @Override
    public double BayarEwallet(int idUser, double saldo, double belanjaTotal) {
        sisaSaldoEWallet = saldo - belanjaTotal;
        return sisaSaldoEWallet;
    }

    @Override
    public double BayarCreditCard(int idUser, double saldo, double belanjaTota) {
        sisaSaldoCreditCard = saldo - belanjaTota;
        return sisaSaldoCreditCard;
    }

    @Override
    public double BayarDebitCard(int idUser, double saldo, double belanjaTotal) {
        return saldo - belanjaTotal;
    }

    @Override
    public double bayarGopay(int idUser, double saldo, double belanjaTotal) {
        // Implementasi bayar Gopay
        return saldo - belanjaTotal;
    }

    @Override
    public double bayarShopee(int idUser, double saldo, double belanjaTotal) {
        sisaSaldoShopee = saldo - belanjaTotal;
        return sisaSaldoShopee;
    }

    // Getter methods for sisa saldo and kembalian
    public double getSisaSaldoEWallet() {
        return sisaSaldoEWallet;
    }

    public double getSisaSaldoCreditCard() {
        return sisaSaldoCreditCard;
    }

    public double getSisaSaldoShopee() {
        return sisaSaldoShopee;
    }

    public double getKembalian() {
        return kembalian;
    }
}