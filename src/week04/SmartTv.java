package week04;
public class SmartTv extends Television{
	private String youtubeID;
	
	public SmartTv(int c, int v, String ID) {
		super(c,v); 
		this.channel = c;
		this.volume = v;
		this.onOff = true;
		youtubeID = ID;
	}
	public void SMprint() {
		this.print();
		System.out.println("Youtube ID: "+youtubeID);
	}
	

}
