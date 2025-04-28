// Kelas KuePesanan yang merupakan subclass dari Kue
public class KuePesanan extends Kue {
    double berat; // Berat kue dalam kilogram 

    // Konstruktor KuePesanan untuk mengisi nama, harga, dan berat
    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga); // Memanggil konstruktor superclass Kue
        this.berat = berat; // Inisialisasi berat kue
    }

    public double getBerat() {
        return berat;
    }

    // Implementasi metode hitungHarga() untuk menghitung harga total berdasarkan berat
    @Override
    public double hitungHarga() {
        return harga * berat; // Harga kue per kilogram dikali berat
    }

    // Override metode toString() untuk menampilkan informasi kue pesanan
    @Override
    public String toString() {
        return String.format("%s, Jenis: KuePesanan (%.2f kg), Harga Akhir: Rp%.0f", 
            super.toString(), berat, hitungHarga());
    }
}