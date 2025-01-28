class Jabuszko{

    private String location;
    private boolean robaczek;

    public Jabuszko(String location){
        this.location = location;
        this.robaczek = Math.random() < 0.5 ? true : false;
        validate();
    }

    private void validate(){
        if (robaczek){
            throw new RobaczekException();
        }
    }
}