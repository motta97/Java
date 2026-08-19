public class PdfReport implements Report{
    @Override
    public void generate(String title){
        System.out.println("[PDF Report]: "+title);
    }
}