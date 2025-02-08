interface Zwierze {
    void wydajDzwiek();
}

class Pies implements Zwierze {
    public void wydajDzwiek() {
        System.out.println("Hau hau!");
    }
}

class Kot implements Zwierze {
    public void wydajDzwiek() {
        System.out.println("Miau miau!");
    }
}