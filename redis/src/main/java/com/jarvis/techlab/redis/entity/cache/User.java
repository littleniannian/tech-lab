package com.jarvis.techlab.redis.entity.cache;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author jarvis
 * @version 1.0.0
 * @Description
 * @createTime 2021年06月06日 23:10:00
 */
public class User extends BaseEntity{
    private static final long serialVersionUID = -7226610758381939211L;

    private String avatar;

    private String description;

    private String email;

    private Timestamp expireTime;

    private String mfaKey;

    private String mfaType;

    private String nickname;

    private String password;

    private String username;

    public User() {
    }

    public User(String avatar, String description, String email, Timestamp expireTime, String mfaKey, String mfaType, String nickname, String password, String username) {
        this.avatar = avatar;
        this.description = description;
        this.email = email;
        this.expireTime = expireTime;
        this.mfaKey = mfaKey;
        this.mfaType = mfaType;
        this.nickname = nickname;
        this.password = password;
        this.username = username;
    }

    public User(Long id, Timestamp updateTime, Timestamp createTime, String avatar, String description, String email, Timestamp expireTime, String mfaKey, String mfaType, String nickname, String password, String username) {
        super(id, updateTime, createTime);
        this.avatar = avatar;
        this.description = description;
        this.email = email;
        this.expireTime = expireTime;
        this.mfaKey = mfaKey;
        this.mfaType = mfaType;
        this.nickname = nickname;
        this.password = password;
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Timestamp expireTime) {
        this.expireTime = expireTime;
    }

    public String getMfaKey() {
        return mfaKey;
    }

    public void setMfaKey(String mfaKey) {
        this.mfaKey = mfaKey;
    }

    public String getMfaType() {
        return mfaType;
    }

    public void setMfaType(String mfaType) {
        this.mfaType = mfaType;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return Objects.equals(avatar, user.avatar) &&
                Objects.equals(description, user.description) &&
                Objects.equals(email, user.email) &&
                Objects.equals(expireTime, user.expireTime) &&
                Objects.equals(mfaKey, user.mfaKey) &&
                Objects.equals(mfaType, user.mfaType) &&
                Objects.equals(nickname, user.nickname) &&
                Objects.equals(password, user.password) &&
                Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), avatar, description, email, expireTime, mfaKey, mfaType, nickname, password, username);
    }

    @Override
    public String toString() {
        return "User{" +
                "avatar='" + avatar + '\'' +
                ", description='" + description + '\'' +
                ", email='" + email + '\'' +
                ", expireTime=" + expireTime +
                ", mfaKey='" + mfaKey + '\'' +
                ", mfaType='" + mfaType + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", id=" + id +
                ", updateTime=" + updateTime +
                ", createTime=" + createTime +
                '}';
    }
}