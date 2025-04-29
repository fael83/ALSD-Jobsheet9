import java.util.Scanner;

public class StackSurat13 {
    Surat13 [] stack;
    int top, size;

    public StackSurat13(int size){
        this.size = size;
        stack = new Surat13[size];
        top = -1;
    }
    public boolean isFull(){
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public void push(Surat13 srt){
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat izin lagi.");
        }
    }
    public Surat13 pop(){
        if (!isEmpty()) {
            Surat13 srt = stack[top];
            top--;
            return srt;
        } else {
            System.out.println("Stack kosong! Tidak ada lagi surat izin yang perlu diproses");
            return null;
        }
    }
    public Surat13 peek(){
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin");
            return null;
        }
    }
    public void cariSurat(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa: ");
        String cariNama = scan.nextLine();
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(cariNama)) {
                System.out.println("Surat izin atas nama " + cariNama + " ditemukan dengan nomor idSurat " + stack[i].idSurat);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat izin atas nama " + cariNama + " tidak ditemukan");
        }
    }
}
