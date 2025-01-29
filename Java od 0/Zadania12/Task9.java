
class A {
    
    private int value;
    public A(int value) {
        this.value = value;
    }

    public void show() {
        System.out.println("Klasa A, wartość: " + value);
    }
}

class B extends A {

    private double size;
    public B(int value, double size) {
        super(value);
        this.size = size;
    }
    @Override
    public void show() {
        System.out.println("Klasa B, wartość: " + size);
    }
}

class Main {
    public static void main(String[] args) {
        
        A objA = new A(10);
        B objB = new B(20, 5.5);

        objA.show();
        objB.show();
    }
}
