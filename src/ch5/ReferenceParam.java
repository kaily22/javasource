package ch5;

public class ReferenceParam {
	public static void main(String[] args) {
		int arr[] = { 3, 2, 1, 6, 5, 4 }; //주소를 가지고 있고 -> heap에 자리

		System.out.println("배열합계 : " + sumArr(arr));
		printArr(arr); //호출
		sortArr(arr);
		printArr(arr);
		
	}

	// 값이 들어가는게 아니라 주소가 들어감
	static void printArr(int arr[]) { // 모든 배열의 요소를 출력 //변수명 달라도 ok //일을 다 끝내면 사라짐
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	static int sumArr(int arr[]) {
		int sum = 0; // 배열의 모든 요소의 합 리턴
		for (int i = 0; i < arr.length; i++) {
			sum += i;
		}
		return sum;

	}

	static void sortArr(int arr[]) { // 배열을 오름차순으로 정렬
		for (int i = 0; i <arr.length-1; i++) { //i<5 /i=0 /i=1/i=2/3/4/5->끝
			for (int j = 0; j <arr.length-1-i; j++) { //j<5/j=4/j=3/2/1/0
				if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}
		}
	}
}


/*
 * 
 * 
 * 
 * for(int i=0; i<arr.length-1; i++) {
 *  for(int j=0; j<arr.length -1 -i; j++) {
 *   if(arr[j] > arr[j+1]){
 *      int temp = arr[j];
 *      arr[j] = arr[j+1];
 *      arr[j+1] = temp;
 * 
 * 
 * 
 */
   