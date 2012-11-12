package zju.lzq.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import zju.lzq.service.AddressService;

public class AddressAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(this.getServlet()
				.getServletContext());
		AddressService addressService = (AddressService) ctx.getBean("addressServiceImpl");
		request.setAttribute("addresses", addressService.getAll());
		return mapping.findForward("list");
	}

}
