public class Main{
    public static void main(String[] args) {
        // Report report= ReportFactory.createReport(ReportType.CSV);
        // report.generate("title");
        // report= ReportFactory.createReport(ReportType.HTML);
        // report.generate("title");
        // report= ReportFactory.createReport(ReportType.PDF);
        // report.generate("title");
        for (ReportType type : ReportType.values()) {
            Report report = ReportFactory.createReport(type);
             report.generate("Annual Performance Summary");
        }
    }
}