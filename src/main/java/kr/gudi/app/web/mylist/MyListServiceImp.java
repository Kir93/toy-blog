package kr.gudi.app.web.mylist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyListServiceImp implements MyListService {

	@Autowired private MyListDao mylistDao;
	
}
