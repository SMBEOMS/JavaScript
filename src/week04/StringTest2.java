package week04;
import java.util.Scanner; //스캐너를 import 해준다
public class StringTest2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		 String web; //web으로 문자열을 입력받을 변수르 선언
		 
		 while(true) { //무한 루프를 만들어준다.
		 System.out.println("문자열을 입력하세요."); //문자열을 입력받는다
	     web = input.nextLine(); //문자열 입력
	     String s1; //s1 변수 선언
			s1 = web.substring (0, 3); // 앞 3개의 문자를 s1에 저장한다
//			System.out.println(web);
			if(web.equals("quit")) { //web에 quit에 입력받으면 
				System.out.println("프로그램을 종료합니다."); //해당 메세지를 출력하고
			break; //프로그램을 종료한다.
				}
			else if(s1.equals("www")) { //www로 시작하면
				System.out.println(web+"은 'www'로 시작합니다.");//해방 메세지를 출력한다
			}
			else { //www로 시작하지 않으면 
				System.out.println(web+"은 'www'로 시작하지 않습니다."); //해당메세지를 출력한다.
			}


			//System.out.println(s1); s1에 대해 테스트를 위해 입력했던 코드

		
		 }
			}
			
	}


