package com.multi.day02;
//문제3. 임의의 숫자를 입력받아 아래와 같은 실행 결과가 나타나는 프로그램을 작성하십시오. 
//정수 n의 팩토리얼(factorial)은 1부터 n까지의 모든 정수를 곱한 것으로 n!로 표시합니다.
//단 2보다 작거나 9보다 큰 정수가 입력될 경우에는 “잘못된 숫자가 입력되었습니다.”라는 경고 메시지를 출력하고 
//프로그램을 종료합니다.

public class FactorialTest {
	public static void main(String[] args) {
		int num= 5;
		int result = 1;
		for(int i=num;i>=1;i--){
			result *=i;
		}
		System.out.println(result);
	}
}
