public class LegacyArchiveAdapter implements DocumentExporter {
    private final LegacyArchiveSystem legacy;

    public LegacyArchiveAdapter(LegacyArchiveSystem legacy) {
        this.legacy = legacy;
    }

    @Override
    public void export(String fileName) {
        legacy.store(fileName, true);
        // TODO 8: translate the new call into the legacy API
    }
}
