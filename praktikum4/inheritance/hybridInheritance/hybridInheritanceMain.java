package hybridInheritance;

public class hybridInheritanceMain {
    public static void main(String[] args) {
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
    }
}
