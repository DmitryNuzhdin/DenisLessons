package checklist.domain;

import java.util.Objects;

public class TaskUpdate {
    public final String taskName;
    public final String taskDescription;
    public final boolean isComplete;

    public TaskUpdate(String taskName, String taskDescription, boolean isComplete) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.isComplete = isComplete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskUpdate that = (TaskUpdate) o;
        return isComplete == that.isComplete &&
                Objects.equals(taskName, that.taskName) &&
                Objects.equals(taskDescription, that.taskDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, taskDescription, isComplete);
    }

    @Override
    public String toString() {
        return "TaskUpdate{" +
                "taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", isComplete=" + isComplete +
                '}';
    }
}
