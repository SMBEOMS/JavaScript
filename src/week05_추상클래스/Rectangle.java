package week05_추상클래스;

class Rectangle extends Shape{
	public int width, height;
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width= width;
		this.height = height;
	}
	public int getWidth() {
		return this.width;
	}
}