package me.allensea.ucenter.provider.service;

import me.allensea.ucenter.dal.dao.UserDAO;
import me.allensea.ucenter.dal.entity.UserDo;
import me.allensea.ucenter.spi.bo.UserBo;
import me.allensea.ucenter.spi.ro.SearchUserRo;
import me.allensea.ucenter.spi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by allen on 17/6/25.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    private UserBo userDo2UserBo(UserDo userDo) {
        UserBo userBo = new UserBo();
        userBo.setId(userDo.getId());
        userBo.setAvatar(userDo.getAvatar());
        userBo.setGender(userDo.getGender());
        userBo.setName(userDo.getName());
        return userBo;
    }

    public UserBo findUserByQuery(SearchUserRo searchUserRo) {
        UserDo userDo = this.userDAO.loadUserById(searchUserRo.getId());
        if (userDo == null) {
            return null;
        }
        return this.userDo2UserBo(userDo);
    }
}
