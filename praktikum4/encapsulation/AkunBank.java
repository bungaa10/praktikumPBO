public class AkunBank {

    private Integer saldo;
    public AkunBank(Integer saldo){
        this.saldo = saldo;
    }
    public void setSaldo(Integer saldo){
        this.saldo = saldo;
    }    
    public Integer getSaldo(){
        return this.saldo;
    }

    public Integer Menabung(Integer saldo){
        if (saldo > 0){
            this.saldo += saldo;
            return this.saldo;
        }else{
            System.out.println("jumlah tabungan harus lebih dari 0");
        }
        return this.saldo;
    }

        public void tarikTunai(int jumlah){
        if(jumlah <= 0){
            System.out.println("Jumlah penarikan harus lebih dari 0");
        } else if(this.saldo - jumlah < 10){
            System.out.println("Penarikan gagal! Saldo minimal $10 harus tersisa.");
        } else {
            this.saldo -= jumlah;
            System.out.println("Berhasil tarik tunai $" + jumlah + ". Saldo sekarang: $" + this.saldo);
        }
    }
}

