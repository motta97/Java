public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("Course Materials");
        Folder week1 = new Folder("Week 1");
        week1.add(new DocumentFile("lecture.pdf", 6));
        week1.add(new DocumentFile("notes.txt", 2));
        root.add(week1);
        root.add(new DocumentFile("assignment.pdf", 4));

        root.print("");
        System.out.println("Total size: " + root.getSize() + " MB");

        System.out.println("=======================================");

        DocumentIterator iterator = root.createIterator();
        while (iterator.hasNext()) {
            System.out.println("Root child: " + iterator.next().getName());
        }

        System.out.println("=======================================");

        DocumentProcessor pdfProcessor = new PdfProcessor();
        pdfProcessor.process("lecture.pdf");
        
        DocumentProcessor textProcessor = new TextProcessor();
        textProcessor.process("Lecture.txt");
        
        System.out.println("=======================================");

        DocumentExporter exporter =
                new LegacyArchiveAdapter(new LegacyArchiveSystem());
        exporter.export("assignment.pdf");
    }
}
