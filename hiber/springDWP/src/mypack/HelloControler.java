package mypack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControler {
	
	@RequestMapping("/helloagain")
	public String show1()
	{
		return "Final";
	}
	
	@RequestMapping("/helloagain")
	public String show2()
	{
		return "Final";
	}

}
