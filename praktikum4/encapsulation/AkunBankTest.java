public class AkunBankTest {

    public static void main(String[] args) {
        AkunBank akunBank1 = new AkunBank(0);
        // AkunBank akunBank2 = new AkunBank(0);
        // AkunBank akunBank3 = new AkunBank(0);

        akunBank1.setSaldo(100);
        System.out.println("saldo akunBank1 : $" + akunBank1.getSaldo());

        //buatkan method menabung
        akunBank1.Menabung(10);
        System.out.println("saldo setelah menabung: $" + akunBank1.getSaldo());
         //tarik tunai
        akunBank1.tarikTunai(90);
        System.out.println("saldo setelah menabung: $" + akunBank1.getSaldo());

        // akunBank2.setSaldo(40);
        // System.out.println("saldo akunBank2 : " + akunBank2.getSaldo());
        // akunBank3.setSaldo(80);
        // System.out.println("saldo akunBank3 : " + akunBank3.getSaldo());
    }

    
}
