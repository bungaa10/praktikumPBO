interface Pinjam {
    void pinjam();
}

interface Kembalikan {
    void kembalikan();
}
class BukuPerpustakaan implements Pinjam, Kembalikan {
    private String judul;
    private String penulis;

    public BukuPerpustakaan(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
    public void pinjam() {
        System.out.println(judul + " oleh " + penulis + " telah dipinjam.");
    }
    public void kembalikan() {
        System.out.println(judul + " oleh " + penulis + " telah dikembalikan.");
    }
}

