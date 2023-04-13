package week05;

public class ShapeTest {
	public static void main(String arg[]) {
		Shape s1, s2;
		
		s1 = new Rectangle(1,2,3,4); 
		s2 = new Rectangle(5,6,7,8);
		
		System.out.println(((Rectangle)s1).width);
}
}
