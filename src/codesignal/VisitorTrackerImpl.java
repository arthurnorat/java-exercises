package codesignal;

import java.util.HashSet;
import java.util.Set;

class VisitorTrackerImpl implements VisitorTracker {

    private final Set<String> visitors;

    public VisitorTrackerImpl() {
        // TODO: implement
        this.visitors = new HashSet<>();
    }

    // TODO: implement interface methods here
    @Override
    public boolean visit(String visitorId) {
        return visitors.add(visitorId);
    }

    @Override
    public boolean hasVisited(String visitorId) {
        return visitors.contains(visitorId);
    }


    @Override
    public boolean removeVisitor(String visitorId) {
       return visitors.remove(visitorId);
    }

    @Override
    public int distinctCount() {
        return visitors.size();
    }
}