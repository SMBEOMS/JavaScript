package week03_배열의선언과사용;

public class 문자열배열 {

public static void main(String[] args) {
		String[] toppings = {"Pepperoni", "Mushrooms", "Onions", "Sausage", "Bacon"};
		
		for(int i = 0; i < toppings.length; i++) { //=이걸쓰면 for루프문 넘어감
			System.out.print(toppings[i] + " ");
		}
	}

}
