package kr.gudi.app.web.file;

public class FileBean {
	
	String path;
	String originName;
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getOriginName() {
		return originName;
	}
	public void setOriginName(String originName) {
		this.originName = originName;
	}
	
	@Override
	public String toString() {
		return "FileBean [path=" + path + ", originName=" + originName + "]";
	}
	
}
