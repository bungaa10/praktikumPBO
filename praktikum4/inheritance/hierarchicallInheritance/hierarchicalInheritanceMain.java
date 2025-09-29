package hierarchicallInheritance;
public class hierarchicalInheritanceMain {
    public static void main(String[] args) { 
         
        // Hierarchical Inheritance
        hierarchicalInheritance app2 = new hierarchicalInheritance();
        hierarchicalInheritance.BukuFiksi fiksi = app2.new BukuFiksi("Laskar Pelangi", "Andrea Hirata", "Drama");
        hierarchicalInheritance.BukuNonFiksi nonFiksi = app2.new BukuNonFiksi("Sejarah Indonesia", "Pramoedya", "Sejarah");
        hierarchicalInheritance.BukuPelajaran pelajaran = app2.new BukuPelajaran("Matematika", "Budi", "Matematika", 10);
        System.out.println("=== BUKU FIKSI ===");
        fiksi.infoFiksi();
        System.out.println("\n=== BUKU NON-FIKSI ===");
        nonFiksi.infoNonFiksi();
        System.out.println("\n=== BUKU PELAJARAN ===");
        pelajaran.infoPelajaran();
        System.out.println("\n=== METHOD DARI SUPERCLASS ===");
        fiksi.info();      
        nonFiksi.info();   
        pelajaran.info();  
    }
}