package week03_2차원배열;

public class _2차원배열예제 {

	public static void main(String[] args) {
		int[][] array = {
				{ 10, 20, 30, 40},
				{ 50, 60, 70, 80},
				{ 90, 100, 110, 120}
		};
		for (int r = 0; r < array.length; r++) { //행 
			for (int c = 0; c < array[r].length; c++) { //열
				System.out.println(r + "행"+ c + "열:" + array[r][c]);
			}
		}
	}

}
