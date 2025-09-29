public class hybridInheritance {
    class Buku {
        String judul;
        String pengarang;

        Buku(String judul, String pengarang) {
            this.judul = judul;
            this.pengarang = pengarang;
        }
        void info() {
            System.out.println("Judul: " + judul + ", Pengarang: " + pengarang);
        }
    }
    class BukuDigital extends Buku {
        int ukuranFile;
        
        BukuDigital(String judul, String pengarang, int ukuranFile) {
            super(judul, pengarang);
            this.ukuranFile = ukuranFile;
        }
        void infoDigital() {
            info();
            System.out.println("Ukuran File: " + ukuranFile + " MB");
        }
    }
    class BukuFisik extends Buku {
        int jumlahHalaman;
        String ISBN;
        
        BukuFisik(String judul, String pengarang, int jumlahHalaman, String ISBN) {
            super(judul, pengarang);
            this.jumlahHalaman = jumlahHalaman;
            this.ISBN = ISBN;
        } 
        void infoFisik() {
            info();
            System.out.println("Jumlah Halaman: " + jumlahHalaman + ", ISBN: " + ISBN);
        }
    }
    interface DapatDipinjam {
        void pinjam();
        void kembalikan();
    }
    interface DapatDiunduh {
        void unduh();
    }

    class EbookInteraktif extends BukuDigital implements DapatDipinjam, DapatDiunduh {
        boolean animasi;
        
        EbookInteraktif(String judul, String pengarang, int ukuranFile, boolean animasi) {
            super(judul, pengarang, ukuranFile);
            this.animasi = animasi;
        }
        public void pinjam() {
            System.out.println(judul + " dipinjam untuk 14 hari");
        }
        
        public void kembalikan() {
            System.out.println(judul + " telah dikembalikan");
        }
        
        public void unduh() {
            System.out.println("Mengunduh " + judul + " - " + ukuranFile + " MB");
        }
        
        void demo() {
            if (animasi) {
                System.out.println(judul + " memiliki fitur animasi interaktif");
            }
        }
    }
}