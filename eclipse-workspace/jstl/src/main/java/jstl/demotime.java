package jstl;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.TagSupport;

public class demotime extends TagSupport {

	public int doStarttag() throws JspException, IOException{
		
		JspWriter out = pageContext.getOut();
		try {
			out.println(Calendar.getInstance().getTime());
		}
		catch(Exception e) {
			out.println(e);
			
		}
		return SKIP_BODY ;
	}
	
}
