package kr.gudi.app.web.file;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	
	public FileBean fileDownload(HttpServletRequest req, String no);
	public Map<String, Object> fileUpload(HttpSession session, MultipartFile[] files);
	
}
