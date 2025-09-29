package praktikum3.exception;

public class ExceptionHandlingDemo {
    public static void cekUmur(int umur) throws Exception {
        if (umur < 18) {
            throw new Exception("Umur harus 18 tahun atau lebih!");
        }
        System.out.println("Umur valid: " + umur);
    }
    public static void main(String[] args) {
        try {
            int[] angka = {1, 2, 3};
            System.out.println("Akses indeks ke-3: " + angka[3]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi Exception: " + e.getMessage());
        }
        try {
            String teks = "abc";
            int angka = Integer.parseInt(teks); 
            System.out.println("Hasil parsing: " + angka);
        } catch (NumberFormatException e) {
            System.out.println("Terjadi kesalahan konversi: " + e.getMessage());
        }
        try {
            int hasil = 10 / 0; 
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Tidak bisa dibagi dengan nol!");
        } finally {
            System.out.println("Blok finally selalu dijalankan!");
        }
        try {
            cekUmur(15); 
        } catch (Exception e) {
            System.out.println("Validasi gagal: " + e.getMessage());
        }

        System.out.println("Program tetap berjalan setelah menangani exception.");
    }
}
