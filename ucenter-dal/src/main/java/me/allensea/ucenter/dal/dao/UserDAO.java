package me.allensea.ucenter.dal.dao;

import me.allensea.ucenter.dal.entity.UserDo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by allen on 17/6/24.
 */
public interface UserDAO {

    /**
     * 根据id获取用户
     * @param id
     * @return
     */
    UserDo loadUserById(@Param("id") int id);
}
