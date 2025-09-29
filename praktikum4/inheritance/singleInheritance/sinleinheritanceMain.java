public class sinleinheritanceMain {
    public static void main(String[] args) {
        singleInheritance bukuPelajaran = new singleInheritance();
        singleInheritance.BukuPelajaran pelajaran = bukuPelajaran.new BukuPelajaran("Matematika", "Dr. Math", "Matematika");
        pelajaran.infoPelajaran();
    }
}
