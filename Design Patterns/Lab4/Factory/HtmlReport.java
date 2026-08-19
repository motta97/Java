public class HtmlReport implements Report{
    @Override
    public void generate(String title){
        System.out.println("[HTML Report]: "+title);
    }
}