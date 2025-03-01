interface Latajacy {
    void lec();
}

interface Plywajacy {
    void plyn();
}

class Amfibia implements Latajacy, Plywajacy {
    @Override
    public void lec() {
        System.out.println("Amfibia leci w powietrzu!");
    }

    @Override
    public void plyn() {
        System.out.println("Amfibia pływa po wodzie!");
    }
}

public class Main {
    public static void main(String[] args) {

        Amfibia amfibia = new Amfibia();
        amfibia.lec();
        amfibia.plyn();
    }
}
    