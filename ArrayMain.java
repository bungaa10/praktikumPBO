public class ArrayMain {
    
    public static void main(String[] args) {
        // String nama1 = "Zahran";
        // String nama1 = "Ravli";
        // String nama1 = "Eva";
        // String nama1 = "Bunga";

        //  cara 1
        String[] nama = {"Zahran", "Ravli", "Eva", "Bunga"};
        System.out.println(nama[3]);

        // cara 2
        String[] daftarNama = new String[4];
        daftarNama[0]= "Zahran";
        daftarNama[1]= "Ravli";
        daftarNama[2]= "Eva";
        daftarNama[3]= "Bunga";
        System.out.println(daftarNama[2]);

        // cara 1
        double[] daftarNilai = {78.5, 77.0, 89.3, 24.84};
        System.out.println(daftarNilai[2]);
        

    }

}
