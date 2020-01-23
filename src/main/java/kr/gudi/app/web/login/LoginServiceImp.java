package kr.gudi.app.web.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService {

	@Autowired private LoginDao loginDao;
	
}
