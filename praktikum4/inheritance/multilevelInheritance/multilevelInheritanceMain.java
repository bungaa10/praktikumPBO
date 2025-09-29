package multilevelInheritance;

public class multilevelInheritanceMain {
    public static void main(String[] args) {
        multilevelInheritance app = new multilevelInheritance();
        multilevelInheritance.NovelRomantis novel = app.new NovelRomantis("Dilan 1990", "Pidi Baiq", "Romantis", 200, "Remaja");
        novel.infoLengkap();  
        novel.infoNovel();    
        novel.info();   
    }
}
