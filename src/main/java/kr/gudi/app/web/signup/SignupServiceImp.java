package kr.gudi.app.web.signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupServiceImp implements SignupService {

	@Autowired private SignupDao signupDao;
	
}
