package codesignal;

import java.util.List;

interface TaskQueue {

    // Level 1
    default int addTask(String taskName) {
        return 0;
    }

    default boolean removeTask(String taskName) {
        return false;
    }

    // Level 2
    default String oldestTask() {
        return "";
    }

    default String taskAt(int position) {
        return "";
    }

    // Level 3
    default boolean completeTask(String taskName) {
        return false;
    }

    default List<String> completedTasks() {
        return null;
    }

    // Level 4
    default List<String> completedInRange(int from, int to) {
        return null;
    }
}