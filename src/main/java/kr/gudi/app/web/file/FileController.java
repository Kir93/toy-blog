package kr.gudi.app.web.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {
	
	@Autowired private FileService fileService;
	
	@RequestMapping(value="/FileDownload/{no}", method=RequestMethod.GET, produces="image/png")
	public @ResponseBody FileSystemResource fileDownload(HttpServletRequest req, @PathVariable("no") String no) {
		FileBean fileBean = fileService.fileDownload(req, no);
		return new FileSystemResource(fileBean.getPath());
	}

	@RequestMapping(value="/FileUpload", method=RequestMethod.POST)
	public @ResponseBody Map<String, Object> fileUpload(HttpSession session, @RequestParam("file") MultipartFile[] files) {
		Map<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("Num", 1);
		session.setAttribute("info", userMap);
		return fileService.fileUpload(session, files);
	}
	
}
