package week05_접근자와설정자;

public class AcoountTest {

	public static void main(String[] args) {
		Account obj = new Account();
		obj.setName("TOM");
		obj.setBalance(100000);
		System.out.println("이름은 " + obj.getName() + "통장 잔고는 " + obj.getBalance()+ "원 입니다.");
	}

}
