public class Produk {
    private String nama;
    private String id;
    private double harga;
    private int stok;
    private String category;

    public Produk(String nama, String id, double harga, int stok, String category) {
        this.nama = nama;
        this.id = id;
        this.harga = harga;
        this.stok = stok;
        this.category = category;
    }

    public void updateStock(int jumlahBaru) {
        this.stok = jumlahBaru;
    }

    public boolean cekStock() {
        return stok > 0;
    }

    public void hapusStock(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
        }
    }

    public double getHarga() { return harga; }
    public String getNama() { return nama; }
    public String getId() { return id; }
}
