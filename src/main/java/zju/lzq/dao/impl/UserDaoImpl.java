package zju.lzq.dao.impl;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import zju.lzq.dao.UserDao;
import zju.lzq.entity.User;

@Repository
public class UserDaoImpl extends SimpleDaoImpl<User> implements UserDao {
	private static Logger log = Logger.getLogger(UserDaoImpl.class);
	public Class<User> bean = User.class;

	public UserDaoImpl() {
		log.info("register " + getClass().getSimpleName());
	}

	@Override
	protected Class<User> getBean() {
		return bean;
	}

	public User getUser(String userName) {
		String hql = "from User where userName = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, userName);
		return (User) query.uniqueResult();
	}

}
