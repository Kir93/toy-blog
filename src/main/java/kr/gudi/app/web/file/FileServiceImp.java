package kr.gudi.app.web.file;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileServiceImp implements FileService {

	@Autowired private FileDao fileDao;
	private Map<String, Object> resultMap;
	private FileBean fileBean;

	@Override
	public FileBean fileDownload(HttpServletRequest req, String no) {
		fileBean = new FileBean();
		resultMap = fileDao.getFile(no);
		if(resultMap != null) {			
			String path = resultMap.get("Path").toString();
			System.out.println("저장 되어 있는 위치 : " + path);
			fileBean.setOriginName(resultMap.get("OriginName").toString());
			fileBean.setPath(path);
		} else {
			String defaultFile = req.getSession().getServletContext().getRealPath("res/img/common.png");
			System.out.println("기본 파일 있는 위치 : " + defaultFile);
			fileBean.setOriginName("common.png");
			fileBean.setPath(defaultFile);
		}
		return fileBean;
	}

	@Override
	public Map<String, Object> fileUpload(HttpSession session, MultipartFile[] files) {
		resultMap = new HashMap<String, Object>();
		List<Map<String, Object>> fileList = new ArrayList<Map<String, Object>>();
		Object oUser = session.getAttribute("info");
		if(oUser != null) {
			Map<String, Object> userMap = (Map<String, Object>) oUser;
			for(int i = 0; i < files.length; i++) {
				Map<String, Object> fileMap = new HashMap<String, Object>();
				String path = session.getServletContext().getRealPath("res/upload/" + userMap.get("Num") + "/" + (i + 1) + ".png");
				MultipartFile file = files[i];
				try {
					FileUtils.copyInputStreamToFile(file.getInputStream(), new File(path));
					fileMap.put("Path", path);
					fileMap.put("OriginName", file.getOriginalFilename());
					fileList.add(fileMap);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		resultMap.put("List", fileList);
		resultMap.put("Size", fileList.size());
		return resultMap;
	}
	
}
