package com.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends TagSupport {

	
	// CREATE TAG HANDLER CLASS
	@Override
	public int doStartTag() throws JspException {
		try {
			JspWriter out = pageContext.getOut();

			out.println("<h1>this is my cutome tag</h1>");

		} catch (Exception e) {

		}
		return SKIP_BODY;
	}

}
