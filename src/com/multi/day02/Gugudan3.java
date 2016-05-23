package com.multi.day02;

//문제1. 1보다 크고 10보다 작은 정수를 입력받아서 아래와 같은 실행 결과가 나타나도록 Prob1 클래스의 main 메소드를 완성하십시오. 
//입력받은 숫자에 해당하는 구구단을 완성시키는 프로그램입니다. 
//2보다 작거나 9보다 큰 정수가 입력될 경우에는 “잘못된 숫자가 입력되었습니다.”라는 경고 메시지를 출력하고 프로그램을 종료합니다.

public class Gugudan3 {
	public static void main(String[] args) {
		int dan = Integer.parseInt(args[0]);
		if (dan < 2 || dan > 9) {
			System.out.println("error");
			// return; // 함수빠지기
			// System.exit(0);// 정상종료
		} else {
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + dan * i);
			}
		}

	}
}
