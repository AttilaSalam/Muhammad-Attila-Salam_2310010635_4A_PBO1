import java.util.Scanner;
import pbo1_uas.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gunung[] daftarGunung = {
            new GunungMudah("Gunung Halau-Halau", 1901),
            new GunungSulit("Gunung Rinjani", 3764)
        };

        try {
            System.out.print("Masukkan nama Anda: ");
            String nama = sc.nextLine();
            if (nama.isEmpty()) throw new Exception("Nama tidak boleh kosong");

            Pendaki pendaki = new Pendaki(nama);
            System.out.println("\nHai " + pendaki.getNama() + ", pilih gunung:");

            for (int i = 0; i < daftarGunung.length; i++) {
                System.out.println((i+1) + ". " + daftarGunung[i].getNama() + " (" + daftarGunung[i].getKetinggian() + " mdpl)");
            }

            System.out.print("Pilihan [1-" + daftarGunung.length + "]: ");
            int pilih = sc.nextInt();
            if (pilih < 1 || pilih > daftarGunung.length) throw new Exception("Pilihan tidak tersedia");

            System.out.print("Durasi pendakian (hari): ");
            int durasi = sc.nextInt();

            Perjalanan p = new Perjalanan(daftarGunung[pilih - 1], durasi);

            System.out.println("\n=== Rencana Pendakian ===");
            p.infoPerjalanan();

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        sc.close();
    }
}