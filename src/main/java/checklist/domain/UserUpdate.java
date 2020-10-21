package checklist.domain;

import java.util.Objects;

public class UserUpdate {
    public final String userName;

    public UserUpdate(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserUpdate that = (UserUpdate) o;
        return Objects.equals(userName, that.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName);
    }

    @Override
    public String toString() {
        return "UserUpdate{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
