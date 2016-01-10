package ie.gmit.sw;

public class Runner {

	public static void main(String[] args) throws Exception {
		
		String s = "new.txt";
		FileParser fp = new FileParser(s);
		Image img = new Image(fp.getMap(), 1000);
		
		System.out.println("Drawing......");
		img.drawImage();
		
		System.out.println("Finished");
		
	}

}
