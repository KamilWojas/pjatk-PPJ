abstract class Zwierze {
    abstract void wydajDzwiek();

    void przedstawSie() {
        System.out.println("Jestem zwierzęciem.");
    }
}

class Pies extends Zwierze {
    @Override
    void wydajDzwiek() {
        System.out.println("Hau! Hau!");
    }
}

class Kot extends Zwierze {
    @Override
    void wydajDzwiek() {
        System.out.println("Miau! Miau!");
    }
}

public class Main {
    public static void main(String[] args) {
        Zwierze pies = new Pies();
        Zwierze kot = new Kot();

        pies.przedstawSie();
        pies.wydajDzwiek();

        kot.przedstawSie();
        kot.wydajDzwiek();
    }
}