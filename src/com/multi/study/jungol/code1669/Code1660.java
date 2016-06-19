package com.multi.study.jungol.code1669;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

//영훈이가 소시지 공장에 견학을 갔다. 그 소시지공장에서는 하나의 기계가 길이와 너비가 다양한 소시지를 만들어 내고 있었다.
//
//유심히 살펴보니 그 기계는 현재 만들고 있는 소시지의 길이와 너비가 바로 전에 만들었던 소시지의 길이, 너비보다 크거나 같아야만 기계가 쉬지 않고 작동하고 있었다. 만약 현재 만들고 있는 소시지의 길이 또는 너비가 바로 전에 만든 것보다 작다면, 기계가 준비 작업을 하는데 1분이 소요된다는 것을 알았다.
// 
//영훈이는 주문 받은 소시지의 길이와 너비를 보고 어떤 소시지부터 만들어 나가는 것이 기계의 준비 작업에 소요되는 시간을 줄일 수 있을지 고민하고 있다.
// 
//주문받은 소시지들을 만드는데 기계가 준비 작업에 소요한 최소의 시간을 구하는 프로그램을 작성하시오.
// 
//단, 첫 소시지를 만들 때는 기계의 준비작업 시간이 1분 소요된다.
// 
//첫 줄에는 주문받은 소시지의 개수 N(1≤N≤5,000)이다. 
//
//둘째 줄에는 소시지의 길이 SL과 소시지의 너비 SW가 N개의 쌍으로 나열된다.
//
//
//주문받은 소시지들을 만드는데 기계가 준비 작업에 소요한 최소의 시간을 출력한다.
//
//[입력]
//5 
//4 9 5 2 2 1 3 5 1 4
//[출력]
//2
//
//
//[입력]
//3
//1 3 2 2 3 1
//[출력]
//3

public class Code1660 {

	static ArrayList<Integer> caseArrSL = new ArrayList<>();
	static ArrayList<Integer> caseArrSW = new ArrayList<>();
	static int testCase;
	static int result;

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/com/multi/study/jungol/code1669/Code1660.txt"));
		Scanner scanner = new Scanner(System.in);
		insertArr(scanner);
		printArr();

		compareMax();

	}


	// maxSL, SW 조회
	public static int compareMax() {
		// maxSL 과 SW 조회
		int maxSL = 0;
		int maxSW = 0;
		int maxNum = 0;
		for (int i = 0; i < caseArrSL.size(); i++) {
			if (maxSL < caseArrSL.get(i) && maxSW < caseArrSW.get(i)) {
				maxSL = caseArrSL.get(i);
				maxSW = caseArrSW.get(i);
				maxNum = i;
			}
		}
		System.out.println(maxSL + ", " + maxSW + ", " + maxNum);
		return maxNum;
	}

	// 정보 입력
	public static void insertArr(Scanner scanner) {
		testCase = Integer.parseInt(scanner.nextLine().trim());
		result = 0;

		System.out.println(testCase);
		while (scanner.hasNext()) {
			caseArrSL.add(scanner.nextInt());
			caseArrSW.add(scanner.nextInt());
		}
	}

	// 정보 출력
	public static void printArr() {
		for (int i = 0; i < caseArrSL.size(); i++) {
			System.out.println(caseArrSL.get(i) + ", " + caseArrSW.get(i));
		}
	}

}
