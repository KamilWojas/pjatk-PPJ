class KontoBankowe{
    private String numerKonta;
    private String wlasciciel;
    private double saldo;
    
    public KontoBankowe(String numerKonta, String wlasciciel, double saldo){
     this.numerKonta = numerKonta;
     this.wlasciciel = wlasciciel;
     this.saldo = saldo;
    }

    public void wplac(double kwota){
        if (kwota > 0){
            saldo += kwota;
            System.out.println("Wpłacono " + kwota + ". Nowe saldo: " + saldo);
        } else {
            System.out.println("Niepoprawna kwota!");
        }
    }
}