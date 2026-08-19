public class MainProtectionProxy {

    public static void main(String[] args) {

        RealDocument realDocument = new RealDocument("ExamSolutions.pdf");

        Document instructorDocument = new DocumentProxy(realDocument, "INSTRUCTOR");

        Document studentDocument = new DocumentProxy(realDocument, "STUDENT");

        System.out.println("Instructor:");
        instructorDocument.view();

        System.out.println("\nStudent:");
        studentDocument.view();
    }
}
