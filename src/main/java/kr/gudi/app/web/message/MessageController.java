package kr.gudi.app.web.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MessageController {
	
	@Autowired private MessageService messageService;
	
}
