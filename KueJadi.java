// Kelas KueJadi yang juga merupakan subclass dari Kue
public class KueJadi extends Kue {
    double jumlah; // Jumlah kue dalam unit (misalnya 5 buah)

    // Konstruktor KueJadi untuk mengisi nama, harga per buah, dan jumlah kue
    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga); // Memanggil konstruktor superclass Kue
        this.jumlah = jumlah; // Inisialisasi jumlah kue
    }

    // Implementasi metode hitungHarga() untuk menghitung harga berdasarkan jumlah kue
    @Override
    public double hitungHarga() {
        return harga * jumlah * 2; // Harga per buah dikali jumlah dan dikali 2
    }

    // Override metode toString() untuk menampilkan informasi kuejadi
    @Override
    public String toString() {
        return String.format("%s, Jenis: KueJadi (%.0f buah), Harga Akhir: Rp%.0f", 
        super.toString(), jumlah, hitungHarga());
    }
}
