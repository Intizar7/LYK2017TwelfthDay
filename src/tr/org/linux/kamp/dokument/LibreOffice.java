package tr.org.linux.kamp.dokument;

public class LibreOffice extends Dokument{

	public LibreOffice(String content, String author) {
		super(content, author);
		
	}

	@Override
	void printDocument() {
		System.out.println("LibreOffice dokumanı yazdırılıyor...");
	}

	@Override
	void getText() {		
	}

}
