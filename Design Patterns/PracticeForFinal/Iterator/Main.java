public class Main{
    public static void main(String[] args) {
        Project project = new Project();
        project.addDesign(new Design("AI ACCELERATOR", "Multiply and Accumulate"));
        project.addDesign(new Design("AMD RAYZEN 7", "add reg0, reg1, reg3"));
        DesignsIterator designsIterator = project.createIterator();
        while(designsIterator.hasNext()){
            Design design = designsIterator.next();
            design.print();
        }
    }
}