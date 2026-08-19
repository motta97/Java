public class CsvReport implements Report{
   @Override
    public void generate(String title){
        System.out.println("[CSV Report]: "+title);
    }
}