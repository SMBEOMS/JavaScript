package week03;
public class ArrayTest3 {

	public static void main(String[] args) {
	int[] s = new int[5];
	int num = 10;
		for (int i =0; i<s.length; i++) {
			s[i]=num;
			num = num+10;
			
		}
		for (int i =0; i<s.length; i++) {
			System.out.print(s[i]+" ");
		}

	}

}
