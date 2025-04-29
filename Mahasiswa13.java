public class Mahasiswa13 {
    public String nama, nim, kelas;
    public int nilai;
    
    Mahasiswa13(String nama, String nim, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}