package chap01;

import java.util.Scanner;

/*
 * 가우스의 덧셈이라는 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램을 작성하시오
 * 연속된 자연수의 합을 구하는 방법으로 연속된 자연수나 연속된 짝수 또는 홀수는 수를 차례로 나열한 다음 거꾸로 나열하여 더하는 방법으로 계산한다.
 */
public class GaussAddition {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);		
		
		System.out.println("1부터 n까지의 합을 구합니다");
		System.out.println("n의 값 :");
		int n = stdIn.nextInt();
		int i = 1;
		
			System.out.println("n"+n+"i"+i);
			int sum=i+n;
			System.out.println("1"+sum);
			sum=sum*n;
			System.out.println("2"+sum);
			sum=sum%2;
			System.out.println("3"+sum);
		
		System.out.println("출력된 정수의 "+n+"값의 합은"+sum+"입니다");
	}

}
