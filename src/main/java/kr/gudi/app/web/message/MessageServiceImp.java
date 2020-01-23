package kr.gudi.app.web.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImp implements MessageService {

	@Autowired private MessageDao messageDao;
	
}
