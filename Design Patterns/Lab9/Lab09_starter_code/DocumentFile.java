public class DocumentFile implements DocumentNode {
    private String name;
    private int size;

    public DocumentFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "- " + name + " (" + size + " MB)");
    }
}
