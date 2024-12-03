package Keuangan;

// MainClass
public class MainClass extends PembayaranBelanja {
    public static void main(String[] args) {
        PembayaranBelanja pb = new PembayaranBelanja();
        
        // Cash Payment
        double kembalian = pb.BayarCash(400000, 0);
        System.out.println("Kembalian: " + kembalian);
        
        // E-Wallet Payment
        pb.BayarEwallet(1, 500000, 20000);
        System.out.println("Sisa Saldo E-Wallet: " + pb.getSisaSaldoEWallet());
        
        // Credit Card Payment
        pb.BayarCreditCard(1, 70000, 4000);
        System.out.println("Sisa Saldo Credit Card: " + pb.getSisaSaldoCreditCard());
        
        // Shopee Payment
        pb.bayarShopee(1, 150000, 127000);
        System.out.println("Sisa Saldo Shopee: " + pb.getSisaSaldoShopee());
    }
}