package kr.pitb.model;

public class UserVO {
	//
	private String id;
	private String pw;
	private String nickname;
	private String saveName;
	private String fileName;
	private String fileId;
	private String region;
	private String chartType;
	
	public UserVO(String id, String pw, String nickname, String saveName, String fileName, String fileId , String region , String chartType) {
		super();
		this.id = id;
		this.pw = pw;
		this.nickname = nickname;
		this.saveName = saveName;
		this.fileName = fileName;
		this.fileId = fileId;
		this.region = region;
		this.chartType = chartType;
	}
	
	public String getChartType() {
		return chartType;
	}

	public void setChartType(String chartType) {
		this.chartType = chartType;
	}

	public UserVO() {
		
	}
	
	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getSaveName() {
		return saveName;
	}

	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	
	
}
