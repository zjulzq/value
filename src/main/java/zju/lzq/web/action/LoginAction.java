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

import zju.lzq.service.UserService;
import zju.lzq.web.form.LoginForm;

@Controller("/login")
public class LoginAction extends Action {
	private static Logger log = Logger.getLogger(LoginAction.class);
	
	@Resource
	private UserService userService;
	
	public LoginAction(){
		super();
		log.info("register " + getClass().getSimpleName());
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LoginForm loginForm = (LoginForm) form;
		//WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(this.getServlet().getServletContext());
		//userService = (UserService) context.getBean("userServiceImpl");
		if (userService.checkLogin(loginForm)) {
			return mapping.findForward("loginSuccess");
		} else {
			return mapping.findForward("loginFailure");
		}
	}

}
