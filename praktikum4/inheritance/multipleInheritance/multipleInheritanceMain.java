package multipleInheritance;

public class multipleInheritanceMain {
    public static void main(String[] args) {
        BukuPerpustakaan buku = new BukuPerpustakaan("Belajar Java", "Andi");
        buku.pinjam();      
        buku.kembalikan();  
    }
}
