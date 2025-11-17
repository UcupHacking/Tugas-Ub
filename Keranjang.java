public class Keranjang {
    private Produk barang;
    private int jumlah;
    private double harga;

    public void simpanProduk(Produk p, int jumlah) {
        this.barang = p;
        this.jumlah = jumlah;
        this.harga = p.getHarga() * jumlah;
    }

    public void buangProduk() {
        this.barang = null;
        this.jumlah = 0;
        this.harga = 0;
    }

    public double getHarga() {
        return harga;
    }
}
