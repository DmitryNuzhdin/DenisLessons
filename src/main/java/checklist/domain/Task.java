package checklist.domain;

import java.util.Objects;

public class Task {
    public final long taskId;
    public final long userId;
    public final String taskName;
    public final String taskDescription;
    public final boolean isComplete;

    public Task(long taskId, long userId, String taskName, String taskDescription, boolean isComplete) {
        this.taskId = taskId;
        this.userId = userId;
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
                Objects.equals(userId, task.userId) &&
                Objects.equals(taskName, task.taskName) &&
                Objects.equals(taskDescription, task.taskDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, userId, taskName, taskDescription, isComplete);
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", user=" + userId +
                ", taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", isComplete=" + isComplete +
                '}';
    }
}
