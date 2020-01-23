package kr.gudi.app.web.myedit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyEditServiceImp implements MyEditService {

	@Autowired private MyEditDao myeditDao;
	
}
