package codesignal;

import java.util.Optional;

public interface TemperatureLog {

    default int record(int temperature) {
        return 0;
    }

    default boolean undo() {
        return false;
    }

    default int size() {
        return 0;
    }

    default Optional<Integer> getMax() {
        return Optional.empty();
    }
}