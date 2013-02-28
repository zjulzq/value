package zju.lzq.entity;

import java.io.Serializable;
import java.util.Date;

public class Score implements Serializable {

	private static final long serialVersionUID = 5285686552144015447L;
	private long id;
	private Person person;
	private AssessTable assessTable;
	private AssessItem assessItem;
	private double score;
	private Date prcDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public AssessTable getAssessTable() {
		return assessTable;
	}

	public void setAssessTable(AssessTable assessTable) {
		this.assessTable = assessTable;
	}

	public AssessItem getAssessItem() {
		return assessItem;
	}

	public void setAssessItem(AssessItem assessItem) {
		this.assessItem = assessItem;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Date getPrcDate() {
		return prcDate;
	}

	public void setPrcDate(Date prcDate) {
		this.prcDate = prcDate;
	}

}
