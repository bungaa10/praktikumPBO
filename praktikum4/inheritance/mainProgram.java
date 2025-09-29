public class mainProgram {
    public static void main(String[] args) {
        // Single Inheritance
        singleInheritance single = new singleInheritance();
        singleInheritance.BukuPelajaran bukuPelajaran = single.new BukuPelajaran("Matematika Dasar", "Andi", "Matematika");
        bukuPelajaran.infoPelajaran();
        System.out.println();
        // Multilevel Inheritance
        multilevelInheritance app = new multilevelInheritance();
        multilevelInheritance.NovelRomantis novel = app.new NovelRomantis("Dilan 1990", "Pidi Baiq", "Romantis", 200, 
        "Remaja"
        );
        novel.infoLengkap();  
        novel.infoNovel();    
        novel.info();  
        // Multiple Inheritance
        BukuPerpustakaan buku = new BukuPerpustakaan("Belajar Java", "Andi");
        buku.pinjam();      
        buku.kembalikan();  
        // Hybrid Inheritance
        hybridInheritance hybrid = new hybridInheritance();
        hybridInheritance.BukuDigital digital = hybrid.new BukuDigital("Java Programming", "John Doe", 25);
        hybridInheritance.BukuFisik fisik = hybrid.new BukuFisik("Python Basics", "Jane Smith", 300, "123-456");
        hybridInheritance.EbookInteraktif interaktif = hybrid.new EbookInteraktif(
            "Interactive Math", "Prof. Math", 50, true
        );
        System.out.println("=== HIERARCHICAL ===");
        digital.infoDigital();
        fisik.infoFisik();
        
        System.out.println("\n=== HYBRID (Multilevel + Multiple) ===");
        interaktif.infoDigital();     
        interaktif.pinjam();         
        interaktif.unduh();           
        interaktif.demo();            
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