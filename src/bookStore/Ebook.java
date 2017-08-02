package bookStore;

public class Ebook extends Book {

	private int fileSize;
	private String encodingFormat;

	public Ebook(int fileSize, String encodingFormat) {
		super(name, author, 20, 200);
		this.fileSize = fileSize;
		this.encodingFormat = encodingFormat;
	}

	public int numberOfDevicesBookBeingUsed() {

		return fileSize;

	}

	// addDevice
	// RemoveDevice
	public int getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

	public String getEncodingFormat() {
		return encodingFormat;
	}

	public void setEncodingFormat(String encodingFormat) {
		this.encodingFormat = encodingFormat;
	}

}
