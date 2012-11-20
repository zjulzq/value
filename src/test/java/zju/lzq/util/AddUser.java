package zju.lzq.util;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.UserDao;
import zju.lzq.entity.Name;
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
		Name name1 = new Name();
		name1.setFirstName("志强");
		name1.setFamilyName("李");
		name1.setPrcDate(DateUtil.today());
		User user1 = new User();
		user1.setName(name1);
		user1.setPassword(MD5Util.MD5("hoge"));
		user1.setAuth(User.AUTH_ADMIN);
		user1.setPrcDate(DateUtil.today());
		userDao.save(user1);

		Name name2 = new Name();
		name2.setFirstName("顺洪");
		name2.setFamilyName("仲");
		name2.setPrcDate(DateUtil.today());
		User user2 = new User();
		user2.setName(name2);
		user2.setAuth(User.AUTH_ADMIN);
		user2.setPassword(MD5Util.MD5("hoge"));
		user2.setPrcDate(DateUtil.today());
		userDao.save(user2);
	}

}
