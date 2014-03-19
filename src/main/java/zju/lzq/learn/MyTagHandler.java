package zju.lzq.learn;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends TagSupport {

	@Override
	public int doEndTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			out.print("This is the output from the custom tag.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return super.doEndTag();
	}

}
