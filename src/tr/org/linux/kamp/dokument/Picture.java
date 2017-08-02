package tr.org.linux.kamp.dokument;


public class Picture extends Dokument{

	public Picture(String content, String author) {
		super(content, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	void printDocument() {
		System.out.println("Resim dokümanı yazdırılıyor...");
	}

	@Override
	void getText() {
		// TODO Auto-generated method stub
		
	}

}
