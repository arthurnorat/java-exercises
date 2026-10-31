package codesignal;

import java.util.Optional;

public interface TaskRegistry {

    default boolean addTask(String name) {
        return false;
    }

    default boolean hasTask(String name) {
        return false;
    }

    default int count() {
        return 0;
    }

    default Optional<String> getLatest() {
        return Optional.empty();
    }
}