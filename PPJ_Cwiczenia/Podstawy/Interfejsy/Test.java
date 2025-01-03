interface Dzwiek {
    void wydajDzwiek();
}

class Kot implements Dzwiek {
    @Override
    public void wydajDzwiek() {
        System.out.println("Miau!");
        }
}

class Test {
    public static void main(String[] args) {
        Dzwiek kot = new Kot();
        kot.wydajDzwiek();
    }
}