package week05_생성자_오버로딩;

public class Point {
	//메소드나 생성자에서 this는 현재 객체를 나타낸다.
	
	public int x = 0;
	public int y = 0;
	
	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
