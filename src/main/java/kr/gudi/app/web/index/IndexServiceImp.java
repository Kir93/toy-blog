package kr.gudi.app.web.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImp implements IndexService {

	@Autowired private IndexDao indexDao;
	
}
