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


}