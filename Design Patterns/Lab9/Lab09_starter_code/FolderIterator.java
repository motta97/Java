import java.util.List;

public class FolderIterator implements DocumentIterator {
    private final List<DocumentNode> items;
    private int index = 0;

    public FolderIterator(List<DocumentNode> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        // TODO 4
        return index<items.size();
        
    }

    @Override
    public DocumentNode next() {
        // TODO 5
        return items.get(index++);
        
    }
}
