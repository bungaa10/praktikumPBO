package praktikum5.Polymorphism;

public class polymorphism {
    // Superclass
    static class Buku {
    String judul;
    String pengarang;

    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    // Method Overloading (Polymorphism Compile-Time)
    public void cetakInfo() {
        System.out.println("Judul: " + judul + ", Pengarang: " + pengarang);
    }

    public void cetakInfo(String format) {
        if (format.equalsIgnoreCase("upper")) {
            System.out.println(("Judul: " + judul + ", Pengarang: " + pengarang).toUpperCase());
        } else {
            cetakInfo();
        }
    }
}

// Subclass
    static class BukuNovel extends Buku {
    String genre;

    public BukuNovel(String judul, String pengarang, String genre) {
        super(judul, pengarang);
        this.genre = genre;
    }

    // Method Overriding (Polymorphism Run-Time)
    @Override
    public void cetakInfo() {
        System.out.println("Novel: " + judul + ", Pengarang: " + pengarang + ", Genre: " + genre);
    }
}

// Main Class
    public static class MainPolymorphism {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Java", "Andi");
        buku1.cetakInfo();
        buku1.cetakInfo("upper");

        Buku buku2 = new BukuNovel("Laskar Pelangi", "Andrea Hirata", "Drama");
        buku2.cetakInfo(); // Akan memanggil method di BukuNovel (Overriding)
    }
}

}
