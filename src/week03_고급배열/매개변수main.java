package week03_고급배열;

public class 매개변수main {

	public static void main(String[] args) {
		if(args.length>0) {
			for(int i = 0; i < args.length ; i++)
				System.out.print(" "+ args[i]);
			
			if(args[0].equals("=h"))
				System.out.print("Help ");
		}
	}

}
