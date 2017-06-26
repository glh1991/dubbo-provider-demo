package me.allensea.ucenter.spi.bo;

import java.io.Serializable;

/**
 * Created by allen on 17/6/25.
 */
public class UserBo implements Serializable {

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
}
