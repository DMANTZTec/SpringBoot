package com.dmantz.springboot.response;

public class FileUploadResponse {

	private String fileId;
	private String fileType;
	private boolean uploadStatus;
	private String downloadUrl;
	private String message;
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public boolean getUploadStatus() {
		return uploadStatus;
	}
	public void setUploadStatus(boolean uploadStatus) {
		this.uploadStatus = uploadStatus;
	}
	public String getDownloadUrl() {
		return downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
