import java.util.Scanner;
public class Parkir18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;

        do {
        System.out.print("Masukkan jenis kendaraan (Ketik '1'untuk mobil, '2' untuk motor, '0' untuk keluar) ");
        jenis = sc.nextInt();
        if (jenis == 1 || jenis == 2) {
            System.out.print("Masukkan durasi(jam): ");
            durasi = sc.nextInt();
            if (durasi > 5) {
                total += 12500;
            } else if (jenis == 1) {
                total += durasi * 3000;
            } else if (jenis == 2) {
                total += durasi * 2000;
            }
        } 
    } while (jenis != 0);

    System.out.println("\nTotal pendapatan parkir: " +total);
    }
}
