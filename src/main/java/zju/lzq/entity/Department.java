package zju.lzq.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Department implements Serializable{
	
	private static final long serialVersionUID = 5525735894901062263L;
	private long id;
	private String name;
	private String code;
	private Person manager;
	private Person viceManager;
	private List<Position> positions;
	private Date prcDate;

	public List<Position> getPositions() {
		return positions;
	}

	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Person getManager() {
		return manager;
	}

	public void setManager(Person manager) {
		this.manager = manager;
	}

	public Person getViceManager() {
		return viceManager;
	}

	public void setViceManager(Person viceManager) {
		this.viceManager = viceManager;
	}

	public Date getPrcDate() {
		return prcDate;
	}

	public void setPrcDate(Date prcDate) {
		this.prcDate = prcDate;
	}

}
