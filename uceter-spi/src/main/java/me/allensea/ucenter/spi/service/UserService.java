package me.allensea.ucenter.spi.service;

import me.allensea.ucenter.spi.bo.UserBo;
import me.allensea.ucenter.spi.ro.SearchUserRo;

/**
 * Created by allen on 17/6/25.
 */
public interface UserService {

    /**
     * 根据条件获取用户
     * @param searchUserRo
     * @return
     */
    UserBo findUserByQuery(SearchUserRo searchUserRo);
}
