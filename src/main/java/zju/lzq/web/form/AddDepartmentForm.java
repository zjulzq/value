package zju.lzq.web.form;

import org.apache.struts.action.ActionForm;

public class AddDepartmentForm extends ActionForm {

	private static final long serialVersionUID = 1L;

	private String deptCode;
	private String deptName;
	private Long manager;
	private Long viceManager;

	public AddDepartmentForm() {
		super();
	}

	public AddDepartmentForm(String deptCode, String deptName, Long manager, Long viceManager) {
		super();
		this.deptCode = deptCode;
		this.deptName = deptName;
		this.manager = manager;
		this.viceManager = viceManager;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Long getManager() {
		return manager;
	}

	public void setManager(Long manager) {
		this.manager = manager;
	}

	public Long getViceManager() {
		return viceManager;
	}

	public void setViceManager(Long viceManager) {
		this.viceManager = viceManager;
	}
}
