package zju.lzq.dao;

import zju.lzq.entity.User;

public interface UserDao extends SimpleDao<User> {
	public User getUser(String userName);
}
