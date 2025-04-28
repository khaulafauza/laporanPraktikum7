// Main Class untuk menjalankan program utama
public class Mainn {
    public static void main(String[] args) {
        Kue[] kueArray = new Kue[20]; // Membuat array yang akan menampung 20 objek Kue

        // Mengisi array dengan berbagai jenis kue (KuePesanan dan KueJadi)
        kueArray[0] = new KuePesanan("Galaxy Dream Cake", 25000, 1.5); // harga per kilogram
        kueArray[1] = new KueJadi("Mocca Meow", 18000, 8); // harga perjumlah
        kueArray[2] = new KuePesanan("Teddy Bear Tart", 23000, 1);
        kueArray[3] = new KueJadi("Choco Dino Bite", 20000, 20);
        kueArray[4] = new KueJadi("Strawberry Blink", 22000, 10);
        kueArray[5] = new KueJadi("Pandan Puff Pop", 16000, 5);
        kueArray[6] = new KuePesanan("Monster Munchies Cake", 24000, 1.1);
        kueArray[7] = new KueJadi("Vanilla Cloudy", 17000, 4);
        kueArray[8] = new KuePesanan("Space Rocket", 28000, 1.6);
        kueArray[9] = new KueJadi("Jumpie Lemon", 19000, 6);
        kueArray[10] = new KuePesanan("Ducky Pool ", 22500, 1);
        kueArray[11] = new KueJadi("Matcha Munch", 21000, 7);
        kueArray[12] = new KuePesanan("Mermaid Splash Cake", 26000, 1.3);
        kueArray[13] = new KueJadi("Blueberry Giggles", 22000, 12);
        kueArray[14] = new KuePesanan("Fluffy Pancake", 50000, 0.5);
        kueArray[15] = new KueJadi("Rainbow Sprinkles", 25000, 20);
        kueArray[16] = new KuePesanan("Candy Crush", 60000, 0.5);
        kueArray[17] = new KueJadi("Caramel Hug", 20000, 18);
        kueArray[18] = new KuePesanan("Bombardiro Pistachio", 75000, 0.6);
        kueArray[19] = new KueJadi("Unicorn Fluffy Cake", 50000, 15);

        // Variabel untuk menghitung total harga, totalberat, totaljumlah
        double totalHarga = 0;
        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0; // dlm kg
        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        Kue kueTermahal = kueArray[0]; // Menyimpan kue dengan harga tertinggi

        // Header tabel
        System.out.printf("%-20s %-15s %-10s %-15s %-15s\n", "Nama Kue", "Jenis Kue", "Harga", "Berat/Jumlah", "Harga Akhir");
        System.out.println("----------------------------------------------------------------------------");

        // Loop untuk menghitung harga dan menampilkan informasi kue
        for (Kue kue : kueArray) {
            if (kue != null) { // Mengecek apakah objek kue ada (tidak null)
                String jenisKue = (kue instanceof KuePesanan) ? "Kue Pesanan" : "Kue Jadi"; // mnenentukan jenis kue
                String beratAtauJumlah = ""; // Menyimpan informasi berat atau jumlah kue

                // Jika kue adalah KuePesanan, tampilkan berat dan tambahkan ke total harga dan berat
                if (kue instanceof KuePesanan) {
                    beratAtauJumlah = String.format("berat: %.2f kg", ((KuePesanan) kue).berat);
                    totalHargaKuePesanan += kue.hitungHarga();
                    totalBeratKuePesanan += ((KuePesanan) kue).berat;
                } 
                // Jika kue adalah KueJadi, tampilkan jumlah dan tambahkan ke total harga dan jumlah
                else if (kue instanceof KueJadi) {
                    beratAtauJumlah = String.format("jumlah: %.0f buah", ((KueJadi) kue).jumlah);
                    totalHargaKueJadi += kue.hitungHarga();
                    totalJumlahKueJadi += ((KueJadi) kue).jumlah;
                }

                totalHarga += kue.hitungHarga(); // Tambahkan harga kue ke total harga

                // Cari kue dengan harga tertinggi
                if (kue.hitungHarga() > kueTermahal.hitungHarga()) {
                    kueTermahal = kue;
                }

                // Menampilkan data kue dalam format tabel
                System.out.printf("%-20s %-15s Rp%-9.0f %-15s Rp%-13.0f\n", 
                    kue.nama, 
                    jenisKue, 
                    kue.harga, 
                    beratAtauJumlah, 
                    kue.hitungHarga());
            }
        }

        // Menampilkan total harga dan kue dengan harga terbesar
        System.out.println("\n===============================================================");
        System.out.printf("Total Harga Semua Kue           : Rp%.0f\n", totalHarga);
        System.out.printf("Total Harga Kue Pesanan         : Rp%.0f\n", totalHargaKuePesanan);
        System.out.printf("Total Berat Kue Pesanan         : %.2f kg\n", totalBeratKuePesanan);
        System.out.printf("Total Harga Kue Jadi            : Rp%.0f\n", totalHargaKueJadi);
        System.out.printf("Total Jumlah Kue Jadi           : %.0f buah\n", totalJumlahKueJadi);
        System.out.println("\nKue dengan Harga Termahal:");
        System.out.println(kueTermahal.toString() + ", Harga Akhir: Rp" + (int)kueTermahal.hitungHarga());
    }
}
