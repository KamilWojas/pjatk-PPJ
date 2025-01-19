class CiagnikSidlowy extends PojazdKolowy{

    private double masa;

    public CiagnikSidlowy(String color, int iloscOsi, double masa){
        super(color, iloscOsi);
        this.masa = masa;
    }

    public void rozpoczniejJazde() throws Exception {
        double naicskNaOs = masa / getIloscOsi();
        System.out.println("Rozpoczęcie procedury sprawdzenia jaki jest nacisk pojazdu na oś" + "\n");
        System.out.println("Nacik na oś: " + naicskNaOs + " ton");
        if (naicskNaOs < 11) {
            throw new Exception("Jazda niebiezpieczna, odmowa uruchomienia silnika");
        }

        System.out.println("Nacisk na oś: " + naicskNaOs + "ton" + "Silnik uruchomiony");
    }


}