package me.allensea.ucenter.dal;

import me.allensea.ucenter.dal.dao.UserDAO;
import me.allensea.ucenter.dal.entity.UserDo;
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
@ContextConfiguration(locations = {"classpath:applicationContext-dal.xml"})
public class UserDAOTest {

    @Autowired
    private UserDAO userDAO;

    @Test
    public void testloadUserById() {
        UserDo userDo = this.userDAO.loadUserById(1);
        Assert.assertEquals(userDo.getId(), 1);
    }

}
