package checklist.domain;

import java.util.Objects;

public class Task {
    public final long taskId;
    public final User user;
    public final String taskName;
    public final String taskDescription;
    public final boolean isComplete;

    public Task(long taskId, User user, String taskName, String taskDescription, boolean isComplete) {
        this.taskId = taskId;
        this.user = user;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.isComplete = isComplete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return taskId == task.taskId &&
                isComplete == task.isComplete &&
                Objects.equals(user, task.user) &&
                Objects.equals(taskName, task.taskName) &&
                Objects.equals(taskDescription, task.taskDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, user, taskName, taskDescription, isComplete);
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", user=" + user +
                ", taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", isComplete=" + isComplete +
                '}';
    }
}
