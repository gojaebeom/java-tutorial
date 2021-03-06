package ch02_상수와형변환;

public class 형변환_자동형변환 {

	public static void main(String[] args) {
		int num1 = 50;
		long num2 = 3147483647L;
		System.out.println(num1 + num2);
		
		/**
		 * @형변환
		 * 위의 상황에서는 int형 변수에 담긴 값을 long형으로 변환해야 데이터의 손실 없이 연산이 가능하다.
		 * 따라서 다음의 과정을 거쳐서 연산을 마무리한다.
		 * - 변수 num1에 저장된 값을 long형으로 변환하여 메모리에 임시 저장한다.
		 * - 이어서 이 변환된 값과 num2에 저장된 값을 대상으로 덧셈을 진행한다.
		 * 
		 * 이러한 일련의 과정을 가리켜 '자료형 변환' 또는 줄여서 '형 변환' 이라고 한다.
		 * 
		 * @자동_형변환
		 * 그리고 위의 예제의 특징으로 자동 형 변환 이라고 한다. 
		 * 프로그래머가 명시한 형 변환이 아니고 필요한 상황에서 자동으로 형 변환이 일어났기 때문이다.
		 * 이렇듯 형 변환이 필요한 상황에서는 다음 두 규칙에 근거하여 자동으로 형 변환이 일어난다.
		 * 
		 * @자동_형변환_규칙
		 * 1. 자료형의 크기가 큰 방향으로 형 변환이 일어난다.
		 * 2. 자료형의 크기에 상관없이 정수 자료형보다 실수 자료형이 우선한다.
		 * 
		 * byte -> short -> int -> long -> float -> double
		 * 		 	char  
		 * 
		 */		   
		
		//자동 형 변환의 예
		double num3 = 30; //int형 정수 30은 double형으로 자동 형 변환 한다.
		System.out.println(60L + 34.5); //long형 정수 60L은 double형으로 자동 형 변환 한다.

	}
}
