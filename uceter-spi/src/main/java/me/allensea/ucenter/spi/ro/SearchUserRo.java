package me.allensea.ucenter.spi.ro;

import java.io.Serializable;

/**
 * Created by allen on 17/6/25.
 */
public class SearchUserRo implements Serializable{

    private int id;
    private String name;

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
}
