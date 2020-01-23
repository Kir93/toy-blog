package kr.gudi.app.web.mylist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MyListController {
	
	@Autowired private MyListService mylistService;
	
}
