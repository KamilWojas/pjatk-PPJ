class PracownikIT {
    private String imie;
    private boolean jestProgramista;
    private boolean jestMenedzerem;

    public PracownikIT(String imie, boolean programista, boolean menedzer) {
        this.imie = imie;
        this.jestProgramista = programista;
        this.jestMenedzerem = menedzer;
    }

    public void pracuj() {
        System.out.println(imie + " pracuje jako:");
        if (jestProgramista) {
            System.out.println("- Programista: pisze kod.");
        }
        if (jestMenedzerem) {
            System.out.println("- Menedżer: zarządza zespołem.");
        }
    }
}