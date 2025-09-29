package hierarchicallInheritance;

public class hierarchicalInheritance {
    class Buku {
        String judul;
        String pengarang;

        Buku(String judul, String pengarang) {
            this.judul = judul;
            this.pengarang = pengarang;
        }
        void info() {
            System.out.println("Judul: " + judul);
            System.out.println("Pengarang: " + pengarang);
        }
    }
    class BukuFiksi extends Buku {
        String genre;
        
        BukuFiksi(String judul, String pengarang, String genre) {
            super(judul, pengarang);
            this.genre = genre;
        }
        
        void infoFiksi() {
            info();
            System.out.println("Genre: " + genre);
        }
    }
    class BukuNonFiksi extends Buku {
        String kategori;
        
        BukuNonFiksi(String judul, String pengarang, String kategori) {
            super(judul, pengarang);
            this.kategori = kategori;
        }
        void infoNonFiksi() {
            info();
            System.out.println("Kategori: " + kategori);
        }
    }
    class BukuPelajaran extends Buku {
        String mataPelajaran;
        int tingkatKelas;
        
        BukuPelajaran(String judul, String pengarang, String mataPelajaran, int tingkatKelas) {
            super(judul, pengarang);
            this.mataPelajaran = mataPelajaran;
            this.tingkatKelas = tingkatKelas;
        }
        void infoPelajaran() {
            info();
            System.out.println("Mata Pelajaran: " + mataPelajaran);
            System.out.println("Tingkat Kelas: " + tingkatKelas);
        }
    }
}