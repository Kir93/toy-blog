package kr.gudi.app.web.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImp implements ProfileService {

	@Autowired private ProfileDao profileDao;
	
}
