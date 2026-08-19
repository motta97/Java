
public class DocumentProxy implements Document {

    private final RealDocument realDocument;
    private final String role;

    public DocumentProxy(RealDocument realDocument, String role) {
        this.realDocument = realDocument;
        this.role = role;
    }

    @Override
    public void view() {

        if (role.equals("INSTRUCTOR")) {
            // TODO 10: delegate to the real document.
            realDocument.view();
        } else {
            System.out.println("Access denied");
        }
    }
}
