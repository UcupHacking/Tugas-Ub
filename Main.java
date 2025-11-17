import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Membuat contoh produk
        Produk p1 = new Produk("Teh Botol", "M001", 5000, 20, "Minuman");
        Produk p2 = new Produk("Roti", "M002", 8000, 10, "Makanan");

        Keranjang keranjang = new Keranjang();
        Scanner input = new Scanner(System.in);

        System.out.println("=== SELAMAT DATANG DI MINIMARKET ===");
        System.out.println("Pilih barang:");
        System.out.println("1. " + p1.getNama() + " - Rp" + p1.getHarga());
        System.out.println("2. " + p2.getNama() + " - Rp" + p2.getHarga());
        System.out.print("Pilihan: ");
        int pilih = input.nextInt();

        Produk barangDipilih = (pilih == 1) ? p1 : p2;

        // Input jumlah
        System.out.print("Masukkan jumlah: ");
        int jumlah = input.nextInt();

        // Masukkan ke keranjang
        keranjang.simpanProduk(barangDipilih, jumlah);
        barangDipilih.hapusStock(jumlah);

        System.out.println("\nBarang berhasil dimasukkan ke keranjang!");
        System.out.println("Total sementara = Rp" + keranjang.getHarga());

        // Cek member
        System.out.print("\nApakah Anda member? (true/false): ");
        boolean isMember = input.nextBoolean();

        // Checkout
        Checkout co = new Checkout(isMember, keranjang.getHarga(), "TRX001");

        System.out.println("\n=== MENCETAK STRUK ===");
        co.cetakStruk();
    }
}
