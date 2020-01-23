package kr.gudi.app.web.file;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class FileDaoImp implements FileDao {
	
	private Map<String, Object> resultMap;

	@Override
	public Map<String, Object> getFile(String no) {
		resultMap = new HashMap<String, Object>();
		System.out.println("파일 저장 위치 가져오기 : " + no);
		resultMap.put("Path", "D:/GDJ21/IDE/workspace/Blog/src/main/webapp/res/upload/user/man.png");
		resultMap.put("OriginName", "man.png");
		return resultMap;
	}
	
}
