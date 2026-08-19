public class ReportFactory{
    private static Report report;
    public static Report createReport(ReportType type){
        if(type.equals(ReportType.CSV))
            report = new CsvReport();
        else if(type.equals(ReportType.HTML))
            report= new HtmlReport();
        else if(type.equals(ReportType.PDF))
            report= new PdfReport();
        else if(type.equals(ReportType.JSON))
            report=new JsonReport();
        else if(type.equals(null)){
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            throw illegalArgumentException;
        }
        return report;
    }   
}