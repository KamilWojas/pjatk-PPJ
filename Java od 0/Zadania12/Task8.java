class Skrzynia{

    private boolean pelna;

    public Skrzynia(){
        this.pelna = false;
        validate();
    }

    private void validate(){
        if (!pelna){
            throw new PustaSkrzyniaException("Skrzynia jest pusta! pech!");
        }
    }
}

 class PustaSkrzyniaException extends RuntimeException{
    public PustaSkrzyniaException(String message){
        super(message);
    }
}

 public class Task8 {
     public static void main(String[] args) {
         new Skrzynia("Znalazłeś skarb");
     }
}