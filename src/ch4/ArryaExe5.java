package ch4;

public class ArryaExe5 {

	public static void main(String[] args) {
		int Arr1[] = new int[10]; //1차원 배열
		int Arr2[] = new int[] { 1, 2, 3, 4, 5 }; // 숫자x
		int Arr3[] = {100, 25, 35, 65, 95 };
		char chArr[] = {'a', 'b', 'c', 'd', 'e' };
		double dArr[] = {35.5, 36.5, 37.5 };
		boolean bArr[] = {true, false, false, true };

		for (int arr : Arr3) {
			System.out.print(arr+"\t");
		}
		for (char ch : chArr) {
			System.out.println(ch+"\n");
		}
		for (double db : dArr) {
			System.out.println(db + "\n");
		}
		for (boolean b : bArr) {
			System.out.println(b + "\n");
		}
	}
}
