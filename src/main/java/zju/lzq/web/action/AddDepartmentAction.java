package zju.lzq.web.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.stereotype.Controller;

import zju.lzq.service.DepartmentService;
import zju.lzq.web.form.AddDepartmentForm;

@Controller("/department/add")
public class AddDepartmentAction extends Action {
	private Logger log = Logger.getLogger(AddDepartmentAction.class);

	@Resource
	private DepartmentService departmentService;

	public AddDepartmentAction() {
		super();
		log.info("register " + getClass().getSimpleName());
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		AddDepartmentForm addDepartmentForm = (AddDepartmentForm) form;
		departmentService.save(addDepartmentForm);
		return mapping.findForward("department");
	}

}
