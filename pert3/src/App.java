
import java.util.ArrayList;
import java.util.Scanner;

import model.Mahasiswa;

public class App {
    private static ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== Aplikasi CRUD Mahasiswa ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Lihat Mahasiswa");
            System.out.println("3. Ubah Mahasiswa");
            System.out.println("4. Hapus Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = Integer.parseInt(scanner.nextLine());

            switch (pilihan) {
                case 1:
                    tambahMahasiswa();
                    break;
                case 2:
                    lihatMahasiswa();
                    break;
                case 3:
                    ubahMahasiswa();
                    break;
                case 4:
                    hapusMahasiswa();
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }

    private static void tambahMahasiswa() {
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        int nim = Integer.parseInt(scanner.nextLine());

        Mahasiswa mhs = new Mahasiswa(nama, nim);
        daftarMahasiswa.add(mhs);
        System.out.println("Mahasiswa berhasil ditambahkan!");
    }

    private static void lihatMahasiswa() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
        } else {
            System.out.println("\nDaftar Mahasiswa:");
            for (int i = 0; i < daftarMahasiswa.size(); i++) {
                System.out.print((i + 1) + ". ");
                System.out.println("Nama: " + daftarMahasiswa.get(i).getNama() + ", NIM: " + daftarMahasiswa.get(i).getNim());
            }
        }
    }

    private static void ubahMahasiswa() {
        lihatMahasiswa();
        if (!daftarMahasiswa.isEmpty()) {
            System.out.print("Pilih nomor mahasiswa yang ingin diubah: ");
            int index = Integer.parseInt(scanner.nextLine()) - 1;

            if (index >= 0 && index < daftarMahasiswa.size()) {
                System.out.print("Masukkan nama baru: ");
                String namaBaru = scanner.nextLine();
                System.out.print("Masukkan NIM baru: ");
                int nimBaru = Integer.parseInt(scanner.nextLine());

                Mahasiswa mhs = daftarMahasiswa.get(index);
                mhs.setNama(namaBaru);
                mhs.setNim(nimBaru);
                System.out.println("Data mahasiswa berhasil diubah!");
            } else {
                System.out.println("Nomor mahasiswa tidak valid!");
            }
        }
    }

    private static void hapusMahasiswa() {
        lihatMahasiswa();
        if (!daftarMahasiswa.isEmpty()) {
            System.out.print("Pilih nomor mahasiswa yang ingin dihapus: ");
            int index = Integer.parseInt(scanner.nextLine()) - 1;

            if (index >= 0 && index < daftarMahasiswa.size()) {
                daftarMahasiswa.remove(index);
                System.out.println("Mahasiswa berhasil dihapus!");
            } else {
                System.out.println("Nomor mahasiswa tidak valid!");
            }
        }
    }
}