import java.util.Scanner;
public class Bioskop18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTiket;
        int totalTiket = 0;
        int totalPenjualan = 0;
        double hargaTiket = 50000;
        String lanjut;
        do {
            System.out.print("Masukkan tiket yang dibeli: " );
            jumlahTiket = sc.nextInt();

            if (jumlahTiket <= 0) {
                System.out.println("Input tidak valid. Masukkan ulang jumlah tiket!");
                continue;
            }

            double totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                totalHarga = totalHarga - (totalHarga * 0.15);
            } else if (jumlahTiket > 4) {
                totalHarga = totalHarga - (totalHarga * 0.1);
            } else {

            }

            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;

            System.out.println("Total harga pembelian ini:: Rp " + totalHarga);
            
            sc.nextLine();
            System.out.println("Apakah masih ada pelanggan? (Ya/Tidak) ");
            lanjut = sc.nextLine();

            if (lanjut.equalsIgnoreCase("Tidak")) {
                break;
            }
        } while (true);
        
        System.out.println("\nTotal tiket terjual: " +totalTiket);
        System.out.println("Total penjualan: Rp" +totalPenjualan);
    }
}
