package week04;

public class TelevisionTest {

	public static void main(String[] args) {
		Television mytv1 = new Television(7, 9, true);
		System.out.println("현재 TV 갯수: "+Television.count);
		Television mytv2 = new Television(7, 9, true);
		System.out.println("현재 TV 갯수: "+Television.count);
		Television mytv3 = new Television(7, 9, true);
		System.out.println("현재 TV 갯수: "+Television.count);
		//mytv.print();
		//mytv.setChannel(11);
		//int ch = mytv.getChannel();
		
		//System.out.println(mytv.toString());
		
		
		Television yourtv = new Television(9, 12, false);
//		yourtv.channel = 9;
//		yourtv.volume = 12;
//		yourtv.onOff = false;
		yourtv.print();

		

	}

}
