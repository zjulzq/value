package zju.lzq.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import zju.lzq.web.form.LoginForm;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LoginForm loginForm = (LoginForm)form;
		if(loginForm.getUserName().equals("lzq")){
			return mapping.findForward("loginSuccess");
		}else{
			return mapping.findForward("loginFailure");
		}
	}

}
