package tr.org.linux.kamp.dokument;

import java.util.ArrayList;
import java.util.Random;

public class TestMain {
	public static void main(String[] args) {
		Random rand =new Random();
		
	    ArrayList<Dokument> printList=new ArrayList<Dokument>();
	    
	   
	    	printList.add(new PDF("Intizar", "Bir Pdf dokumanıdır...",15));
	    	printList.add(new Picture("Java Sınıfı", "Java"));
	    	printList.add(new LibreOffice("Yaz Kamp","Bu bir Libraeoffice dokümanıdır"));
	    	
	    	int index; 
	    		index=rand.nextInt(3);
	    		printList.get(index).printDocument();
	    		if(printList.get(index) instanceof PDF) {
	    		System.out.println("Yazar:"+printList.get(index).getAuthor()+
	    				"Içerik:"+printList.get(index).getContent()+"\t"+
	    				((PDF) printList.get(index)).getPageNumber());
	    	
	    		}else {
	    			System.out.println("Yazar:"+printList.get(index).getAuthor()+
		    				"Içerik:"+printList.get(index).getContent());
	    		}
	    	}

	}
	
    

