package tr.org.linux.kamp.dokument;

import java.sql.Time;
import java.time.LocalDate;

public abstract class Dokument {
	
	private String content;
	private LocalDate time;
	private String author;
	
	
	
	public Dokument(String content, String author) {
		super();
		this.content = content;
		this.author=author;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	abstract void printDocument();
	abstract void getText();
	

}
