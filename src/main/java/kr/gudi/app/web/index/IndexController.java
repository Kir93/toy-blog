package kr.gudi.app.web.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@Autowired private IndexService indexService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String home() {return "redirect:/res/index.html";}
	
}
