package tr.org.linux.kamp.dokument;

public class PDF extends Dokument{
    
	private int pageNumber;
	public int getPageNumber() {
		return pageNumber;
	}

	
	public PDF(String author,String content,int pageNumber) {
		super(author, content);
		this.pageNumber=pageNumber;
	}

	@Override
	void printDocument() {
	System.out.println("PDF dosyası yaziliyor...");
		//System.out.println(super.getAuthor()+super.getContent());
	}

	@Override
	void getText() {
		// TODO Auto-generated method stub
		
	}
	
	
}
