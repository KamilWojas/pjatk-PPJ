public class Main {

    public static void main(String[] args) {

        Zwierzak kot = new Zwierzak("Mlody", 5);
        kot.setWaga(10);
        kot.setWaga(10, "10-12-2001");
        kot.incWiek();
        kot.show();

    }
}