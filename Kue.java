// Kelas abstrak Kue yang berfungsi untuk mendefinisikan jenis kue secara umum
public abstract class Kue {
    String nama; // Nama kue
    double harga; // Harga per unit (per gram atau per buah)

    // Konstruktor untuk memberikan nama dan harga saat membuat objek Kue
    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Method abstrak untuk menghitung harga, akan diimplementasikan di subclass
    public abstract double hitungHarga();

    // Override dari metode toString untuk menampilkan nama dan harga kue
    @Override
    public String toString() {
        return "Nama Kue: " + nama + ", Harga: " + harga;
    }
}