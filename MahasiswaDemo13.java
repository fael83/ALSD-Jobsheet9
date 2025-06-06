import java.util.Scanner;

public class MahasiswaDemo13 {
    public static void main(String[] args) {
        StackTugasMahasiswa13 stack = new StackTugasMahasiswa13(5);
        Scanner scan = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Hitung tugas yang dikumpulkan");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa13 mhs = new Mahasiswa13(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa13 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Manilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai biner Tugas " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa13 lihatTeratas = stack.peek();
                    if (lihatTeratas != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihatTeratas.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa13 lihatTerbawah = stack.Terbawah();
                    if (lihatTerbawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + lihatTerbawah.nama);
                    }
                    break;
                case 6:
                    stack.hitungTugas();
                    break;
                default:
            }
        } while (pilih >= 1 && pilih <=6);
    }
}
