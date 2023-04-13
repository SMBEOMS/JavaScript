package week05;

public class SafeArray {
	private int a[];
	public int length;
public SafeArray(int size) { 
	a = new int[size];
	length = size;
}
public int getA(int index) {
	if(index >= 0 && index < length) {
		return a[index];
	}
	else {
		System.out.println("잘못된 인덱스" + index);
		return 0;
	}

}
public void setA(int index, int value) {
	if(index >= 0 && index < length) {
		a[index] = value;
		return;
		}
	else {
		System.out.println("잘못된 인덱스" + index);
		return;
	}
	}
}