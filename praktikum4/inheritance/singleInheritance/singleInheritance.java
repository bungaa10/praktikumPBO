public class singleInheritance {
class Buku {
    String judul;
    String pengarang;

    Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }
    void showInfo() {
        System.out.println("Judul: " + judul );
        System.out.println("Pengarang: " + pengarang);
    }
}
class BukuPelajaran extends Buku { 
    String mataPelajaran;

    BukuPelajaran(String judul, String pengarang, String mataPelajaran) {
        super(judul, pengarang);
        this.mataPelajaran = mataPelajaran;
    }
    void infoPelajaran() {
        showInfo();
        System.out.println("Mata Pelajaran: " + mataPelajaran);
    }
}    
}