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

 public PustaSkrzyniaException extends RuntimeException{

        }