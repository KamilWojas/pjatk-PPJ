interface Displayable {
    void show();
}

interface Calculable {
    int calculate();
}

class A implements Displayable {
    private int value;
    
    public A(int value) {
        this.value = value;
    }

    @Override
    public void show() {
        System.out.println("Klasa A, wartość: " + value);
    }
}

class B extends A implements Calculable {
    private double size;

    public B(int value, double size) {
        super(value);
        this.size = size;
    }
    
    @Override
    public void show() {
        System.out.println("Klasa B, wartość: " + size);
    }

    @Override
    public int calculate() {
        return (int) (size * 10);
    }
}

class C extends B {
    private String name;

    public C(int value, double size, String name) {
        super(value, size);
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("Klasa C, nazwa: " + name);
    }

    @Override
    public int calculate() {
        return super.calculate() + name.length();
    }
}

public class Main {
    public static void main(String[] args) {

        A objA = new A(10);
        B objB = new B(20, 5.5);
        C objC = new C(30, 7.2, "ObiektC");

        objA.show(); 
        objB.show(); 
        objC.show();

        System.out.println("Wynik obliczeń B: " + objB.calculate());
        System.out.println("Wynik obliczeń C: " + objC.calculate());

    }
}