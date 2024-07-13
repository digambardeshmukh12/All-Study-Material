package mypack;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String display(HttpServletRequest req,Model m)
	{
		String un=req.getParameter("t1");
		String p=req.getParameter("t2");
		if(un.contentEquals("admin"))
		{
			String s="Welcome,"+un;
			m.addAttribute("message",s);
			return "viewpage";
		}
		else
		{
			String s="Sorry incorrect,"+un;
			m.addAttribute("message",s);
			return "final";
		}

}
