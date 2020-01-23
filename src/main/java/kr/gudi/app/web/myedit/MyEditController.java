package kr.gudi.app.web.myedit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MyEditController {
	
	@Autowired private MyEditService myeditService;
	
}
