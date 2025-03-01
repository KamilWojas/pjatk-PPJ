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