package zju.lzq.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	public static final int AUTH_ORIDINARY = 0;
	public static final int AUTH_MANAGER = 1;
	public static final int AUTH_GENERALMANAGER = 2;
	public static final int AUTH_ADMIN = 3;

	private static final long serialVersionUID = -5586714168499316384L;
	private long id;
	private String userName;
	private String password;
	private Person person;
	private int auth;
	private Date prcDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getAuth() {
		return auth;
	}

	public void setAuth(int auth) {
		this.auth = auth;
	}

	public Date getPrcDate() {
		return prcDate;
	}

	public void setPrcDate(Date prcDate) {
		this.prcDate = prcDate;
	}

}
