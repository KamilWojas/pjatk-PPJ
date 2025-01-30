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

}