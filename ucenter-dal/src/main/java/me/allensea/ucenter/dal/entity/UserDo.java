package me.allensea.ucenter.dal.entity;

import java.io.Serializable;

/**
 * Created by allen on 17/6/24.
 */
public class UserDo implements Serializable {

    private int id;
    private String name;
    private int gender;
    private String avatar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "UserDo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
