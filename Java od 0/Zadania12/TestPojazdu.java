public class TestPojazdu{
    public static void main(String[] args) {

        try{
            CiagnikSidlowy ciagnik = new CiagnikSidlowy("Black", 4, 10);
            ciagnik.rozpoczniejJazde();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
    