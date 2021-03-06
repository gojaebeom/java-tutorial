package ch10_배열;

public class 배열_생성과초기화 {
	
	/**
	 * @생성과_초기화
	 * 배열도 변수와 마찬가지로 생성과 동시에 초기화가 가능하다.
	 * 기본적인 배열의 생성 방식은 다음과 같다.
	 */
	
	int[] arr = new int[3];
	
	/**
	 * 이 배열을 생성과 동시에 초기화하려면
	 * 초기화할 값들을 다음과 같이 중괄호를 이용해서 나열하면 된다. 
	 */
	
	//int[] arr2 = new int[3] {1, 2, 3}; //컴파일 오류 발생
	
	/**
	 * 그런데 위의 문장에서는 초기화할 값들의 수를 통해 배열의 길이 정보를 계산할 수 있으므로,
	 * 이경우 배열의 길이 정보를 생략하도록 약속하였다. 즉 위의 문장은 다음과 같이 수정해야 한다.
	 */
	
	int[] arr2 = new int[] {1, 2 ,3};
	
	/**
	 * 위의 문장을 통해 생성되는 배열의 길이는 3이다.
	 * 그리고 위의 문장은 다음과 같이 줄여서 표현할 수 도있다.
	 */
	
	int[] arr3 = {1, 2, 3};
	
	/**
	 * @참조변수_선언의_두가지_방법
	 * 다음과 같이 배열을 생성하는 문장에서도 이 둘은 동일한 의미로 사용이 된다.
	 */
	int[] ar1 = new int[3]; //조금 더 선호하는 방법
	int ar2[] = new int[3];
	
	
	/**
	 * @배열의_참조_값과_메소드
	 * 배열도 인스턴스이므로 메소드 호출 시 참조 값의 전달이 가능하다.
	 * 예를 들어 다음과 같이 배열의 참조 값을 인자로 전달할 수 있다.
	 */
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.println(sumOfAry(arr));
	}
	
	/**
	 * 물론 아래 메소드처럼 메소드 생성시 배열의 참조변수를 매개변수로 선언해야 한다.
	 */
	static int sumOfAry(int[] arr) {
		int sum = 0;
		for(int i = 0; i< arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	/**
	 * 이 과정에서 배열이 새로 생성되는 것은 아니다. 그저 배열 인스턴스를 참조할 수 있는 참조 값만 인자로 전달이 되고,
	 * 이 값을 매개변수로 받을 뿐이다. 
	 * 그리고 다음과 같이 배열의 참조 값을 반환하는 메소드를 정의하는 것도 가능하다.
	 */
	
	static int[] reIntArr(int x) {
		int[] arr = new int[x];
		return arr;
	}

}
