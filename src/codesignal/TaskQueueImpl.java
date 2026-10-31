package codesignal;

import java.util.ArrayList;
import java.util.List;

class TaskQueueImpl implements TaskQueue {

    private final List<String> tasks;
    private final List<String> completed;

    public TaskQueueImpl() {
        // TODO: implement
        this.tasks = new ArrayList<>();
        this.completed = new ArrayList<>();
    }
    // TODO: implement interface methods here

    @Override
    public int addTask(String taskName) {
        tasks.add(taskName);
        return tasks.size();
    }

    @Override
    public boolean removeTask(String taskName) {
        return tasks.remove(taskName);
    }

    @Override
    public String oldestTask() {
        if (tasks.isEmpty()) {
            return "";
        }

        return tasks.get(0);
    }

    @Override
    public String taskAt(int position) {
        if (position < 1) {
            return "";
        }
        if(position > tasks.size()) {
            return "";
        }
        return tasks.get(position - 1);
    }

    @Override
    public boolean completeTask(String taskName) {
        if (!tasks.contains(taskName)) {
            return false;
        } else {
            tasks.remove(taskName);
            completed.add(taskName);
            return true;
        }
    }

    @Override
    public List<String> completedTasks() {
        return completed;
    }

//    public List<String> completedInRange(int from, int to) {
//        if (from > to) {
//            return new ArrayList<>();
//        }
//        if (!completed.contains(from) && !completed.contains(to)) {
//            return new ArrayList<>();
//        }
//
//    }
}