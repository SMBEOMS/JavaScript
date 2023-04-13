package week03;

public class KoreanChar2 {

	public static void main(String[] args) {
		char a = '가';
		char z = '힣';
		
		do {
			if(a == '나' || a == '다' || a == '마' || a == '바' || a == '사' || a == '아' || a == '자' || a == '차' || a == '카' || a == '타' || a == '파' || a == '하') {
				System.out.println("");
				System.out.println("\\n--...--\\n");
				
			}
		System.out.print(a);
		char more = (char)(a +1);
		a = more;
	}while(a<=z);

	}
}
        
        
//		int intVal;
//		char charVal = 'ㄷ';
//		intVal = charVal;
//		System.out.println("가의 유니코드: "+ intVal);
		
//		String uni = "AC00"; 
//		String text = "가"
		// ㄱ = 12593
		// ㄴ = 	12596
		// ㄷ = 12599
		// 가 = 44032
		// 나 = 45208 가-나 = 1176
		// 다 = 45796
//		String text = "힣"= 55203
////		System.out.println((char)44033);
//		System.out.format("0x%04X%n", (int)text.charAt(0));
		// 44032 == "가"
//		while(true)
//		{
//			
//		}
//		//System.out.println("\uAC00");
		
		

