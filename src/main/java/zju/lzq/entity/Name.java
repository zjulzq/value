package zju.lzq.entity;

import java.io.Serializable;
import java.util.Date;

public class Name implements Serializable {

	private static final long serialVersionUID = -2789116562394437778L;
	private long id;
	private String firstName;
	private String familyName;
	private Date prcDate;

	public Date getPrcDate() {
		return prcDate;
	}

	public void setPrcDate(Date prcDate) {
		this.prcDate = prcDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

}
