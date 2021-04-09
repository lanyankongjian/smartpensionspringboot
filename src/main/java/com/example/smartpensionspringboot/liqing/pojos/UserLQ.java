package com.example.smartpensionspringboot.liqing.pojos;

import java.util.Objects;

public class UserLQ {
    private Integer userId;
    private String userName;
    private String userPass;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserLQ userLQ = (UserLQ) o;
        return userId == userLQ.userId &&
                Objects.equals(userName, userLQ.userName) &&
                Objects.equals(userPass, userLQ.userPass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userPass);
    }
}
