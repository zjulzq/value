package zju.lzq.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.UserDao;
import zju.lzq.entity.User;
import zju.lzq.service.UserService;
import zju.lzq.util.MD5Util;
import zju.lzq.web.form.LoginForm;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	private static Logger log = Logger.getLogger(UserServiceImpl.class);

	@Resource
	private UserDao userDao;

	public UserServiceImpl() {
		log.info("register " + getClass().getSimpleName());
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public boolean checkLogin(LoginForm loginForm) {
		if (loginForm == null || loginForm.getUserName() == null || loginForm.getPassword() == null) {
			return false;
		}

		User user = userDao.getUser(loginForm.getUserName());
		if (user == null) {
			return false;
		}

		if (MD5Util.MD5(loginForm.getPassword()).equals(user.getPassword())) {
			return true;
		} else {
			return false;
		}
	}

}
