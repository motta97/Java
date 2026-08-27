public abstract class DocumentProcessor {
    public final void process(String fileName) {
        open(fileName);
        String content = extractContent(fileName);
        content = cleanContent(content);
        save(content);
    }

    protected final void open(String fileName) {
        System.out.println("Opening " + fileName);
    }

    protected abstract String extractContent(String fileName);

    protected String cleanContent(String content) {
        return content.trim();
    }

    protected final void save(String content) {
        System.out.println("Saved: " + content);
    }
}
