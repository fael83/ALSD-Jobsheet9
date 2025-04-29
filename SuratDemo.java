import java.util.Scanner;

public class SuratDemo {
    public static void main(String[] args) {
        StackSurat13 stack = new StackSurat13(7);
        Scanner scan = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenisIzin = scan.nextLine().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = scan.nextInt();
                    Surat13 srt = new Surat13(idSurat, nama, kelas, jenisIzin, durasi);
                    stack.push(srt);
                    break;
                case 2:
                    Surat13 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat dari " + diproses.namaMahasiswa + " telah diproses");
                    }
                    break;
                case 3:
                   Surat13 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat izin terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    stack.cariSurat();
                    break;
                default:
            }
        } while (pilih >= 1 && pilih <=4);
    }
}
