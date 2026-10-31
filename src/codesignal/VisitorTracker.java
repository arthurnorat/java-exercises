package codesignal;

public interface VisitorTracker {

    default boolean visit(String visitorId) {
        return false;
    }

    default boolean hasVisited(String visitorId) {
        return false;
    }

    default boolean removeVisitor(String visitorId) {
        return false;
    }

    default int distinctCount() {
        return 0;
    }
}