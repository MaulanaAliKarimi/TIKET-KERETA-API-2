import java.util.Scanner;

public class script {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Aplikasi Pembelian Tiket Kereta Api ===");

        // Memilih Jurusan
        System.out.println("Pilih Jurusan:");
        System.out.println("1. Cikampek-Tuparev Rp. 20000");
        System.out.println("2. Johar-Bypass Rp. 15000");
        System.out.println("3. Klari-Badami Rp. 10000");
        System.out.print("Masukkan nomor jurusan: ");
        int nomorJurusan = scanner.nextInt();

        // Memilih Kelas
        System.out.println("\nPilih Kelas:");
        System.out.println("1. Business Rp 30000");
        System.out.println("2. Executive Rp 20000");
        System.out.print("Masukkan nomor kelas: ");
        int nomorKelas = scanner.nextInt();

        // Menghitung Harga Tiket
        int hargaTiket = hitungHargaTiket(nomorJurusan, nomorKelas);

        // Menampilkan hasil pembelian
        System.out.println("\nAnda telah membeli tiket kereta api dengan rincian:");
        System.out.println("Jurusan: " + getNamaJurusan(nomorJurusan));
        System.out.println("Kelas: " + getNamaKelas(nomorKelas));
        System.out.println("Harga Tiket: Rp " + hargaTiket);
    }

    // Method untuk menghitung harga tiket berdasarkan jurusan dan kelas
    public static int hitungHargaTiket(int nomorJurusan, int nomorKelas) {
        int hargaTiket = 0;

        switch (nomorJurusan) {
            case 1: // Cikampek-Tuparev
                hargaTiket += 20000;
                break;
            case 2: // Johar-Bypass
                hargaTiket += 15000;
                break;
            case 3: // Klari-Badami
                hargaTiket += 10000;
                break;
        }

        switch (nomorKelas) {
            case 1: // Business
                hargaTiket += 30000;
                break;
            case 2: // Executive
                hargaTiket += 20000;
                break;
        }

        return hargaTiket;
    }

    // Method untuk mendapatkan nama jurusan berdasarkan nomor jurusan
    public static String getNamaJurusan(int nomorJurusan) {
        switch (nomorJurusan) {
            case 1:
                return "Cikampek-Tuparev";
            case 2:
                return "Johar-Bypass";
            case 3:
                return "Klari-Badami";
            default:
                return "Jurusan Tidak Valid";
        }
    }

    // Method untuk mendapatkan nama kelas berdasarkan nomor kelas
    public static String getNamaKelas(int nomorKelas) {
        switch (nomorKelas) {
            case 1:
                return "Business";
            case 2:
                return "Executive";
            default:
                return "Kelas Tidak Valid";
        }
    }
}