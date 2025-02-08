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

class Krowa implements Zwierze {
    public void wydajDzwiek() {
        System.out.println("Muuu!");
    }
}

public class Task12 {
    public static void main(String[] args) {