import java.util.ArrayList;
import java.util.List;

public class Folder implements DocumentNode {
    private String name;
    private List<DocumentNode> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(DocumentNode node) {
        // TODO 1
        children.add(node);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        // TODO 2: return the sum of every child's getSize()
        int sum = 0;
        for( DocumentNode node: children){
            sum+=node.getSize();
        }
        return sum;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "+ " + name);
        // TODO 3: print every child using a deeper indentation
        for( DocumentNode node: children){
            node.print(indent + "   ");
        }
    }

    // Supplied for Part I, Problem 4, Part B.
    public DocumentIterator createIterator() {
        return new FolderIterator(children);
    }
}
