public class Checkout {
    private boolean member;
    private double total;
    private String idTransaksi;

    public Checkout(boolean member, double total, String idTransaksi) {
        this.member = member;
        this.total = total;
        this.idTransaksi = idTransaksi;
    }

    public boolean cekMember() {
        return member;
    }

    public double hitungDiskon() {
        if (member) {
            return total * 0.10; // 10%
        }
        return 0;
    }

    public void cetakStruk() {
        double diskon = hitungDiskon();
        double bayar = total - diskon;

        System.out.println("=== STRUK BELANJA ===");
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Total Harga  : Rp" + total);
        System.out.println("Diskon       : Rp" + diskon);
        System.out.println("Total Bayar  : Rp" + bayar);
    }
}
