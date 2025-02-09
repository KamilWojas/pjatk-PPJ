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
