package multilevelInheritance;
public class multilevelInheritance {
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
    class Novel extends Buku {
        String genre;
        int jumlahHalaman;

        Novel(String judul, String pengarang, String genre, int jumlahHalaman) {
            super(judul, pengarang);
            this.genre = genre;
            this.jumlahHalaman = jumlahHalaman;
        }
        void infoNovel() {
            info();
            System.out.println("Genre: " + genre);
            System.out.println("Jumlah Halaman: " + jumlahHalaman);
        }
    }
    class NovelRomantis extends Novel {
        String targetPembaca;

        NovelRomantis(String judul, String pengarang, String genre, int jumlahHalaman, 
                     String targetPembaca) {
            super(judul, pengarang, genre, jumlahHalaman);
            this.targetPembaca = targetPembaca;
        
        }
        void infoLengkap() {
            infoNovel();  
            System.out.println("Target Pembaca: " + targetPembaca);
        }
    }
}