package me.allensea.ucenter.provider.service;

import me.allensea.ucenter.spi.bo.UserBo;
import me.allensea.ucenter.spi.ro.SearchUserRo;
import me.allensea.ucenter.spi.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by allen on 17/6/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-provider.xml" })
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testFindUserByQuery() {
        SearchUserRo searchUserRo = new SearchUserRo();
        searchUserRo.setId(1);
        UserBo userBo = this.userService.findUserByQuery(searchUserRo);
        Assert.assertEquals(userBo.getId(), 1);
    }
}
