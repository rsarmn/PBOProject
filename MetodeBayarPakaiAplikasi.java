package Keuangan;

// MetodeBayarPakaiAplikasi Interface
public interface MetodeBayarPakaiAplikasi extends MetodeBayar {
    double bayarGopay(int idUser, double saldo, double belanjaTotal);
    double bayarShopee(int idUser, double saldo, double belanjaTotal);
}