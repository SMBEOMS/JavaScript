package week05_메소드로객체전달하고반환;
public class Box {
	int width, length, height;
	int volume;
	Box(int w, int l, int h){
		width=w;
		length=l;
		height=h;
		volume=w*l*h;
	}
	Box whosLargest(Box box1, Box box2) {
		if(box1.volume>box2.volume)
			return box1;
		else
			return box2;
	}
	public boolean isSameBox(Box obj) {
		if (obj.width == this.width && obj.length == this.length && obj.height==this.height){
			return true;	
		}
		else
			return false;
	}
}
