public class Main{
    public static void main(String[] args) {
        Component composite = new Composite("Folder A");
        Component compoiste2 = new Composite("Folder B");
        composite.add(compoiste2);
        compoiste2.add(new Leaf("FINAL_EXAMS.pdf"));
        composite.add(new Leaf("Readme.md"));
        Component composite3 = new Composite("FOLDER C");
        composite3.add(new Leaf("The AI GUIDE.pdf"));
        compoiste2.add(composite3);
        composite.print("  ");
    }
}