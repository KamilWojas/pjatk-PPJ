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
            throw new RobaczekException("A ja już nie mogę! Już dosyć! basta");
        }
    }
}

    class RobaczekException extends RuntimeException{
      public RobaczekException(String message){
        super(message);
    }
}

 public class Task03{
     public static void main(String[] args) {
      new Jabuszko("Sad");
     }
 }