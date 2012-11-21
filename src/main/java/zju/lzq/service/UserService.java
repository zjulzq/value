package zju.lzq.service;

import zju.lzq.web.form.LoginForm;

public interface UserService {
	public boolean checkLogin(LoginForm loginForm);
}
