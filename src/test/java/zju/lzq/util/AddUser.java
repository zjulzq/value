package zju.lzq.util;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.UserDao;
import zju.lzq.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext-test.xml" })
@TransactionConfiguration(transactionManager = "txManager")
@Transactional
public class AddUser {
	@Resource
	private UserDao userDao;

	@Test
	@Rollback(true)
	public void addUser() {
		User user = new User();
		user.setUserName("li_z");
		user.setPassword(MD5Util.MD5("hoge"));
		user.setAuth(User.AUTH_ADMIN);
		user.setPrcDate(new Date());
		userDao.save(user);
	}
}
