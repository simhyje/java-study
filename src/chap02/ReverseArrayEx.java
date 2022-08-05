package chap02;

import java.util.Scanner;

public class ReverseArrayEx {
	
	//스위치 메소드
	static void swap(int [] a, int idx1, int idx2){
		int t = a[idx1];
		a[idx1] =a[idx2];
		a[idx2] = t;
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println("");
	}
	
	//역순 정렬 메소드
	static void reverse(int []a) {
		
		for(int i = 0; i<a.length / 2+1; i++) {
			System.out.println("a["+i+"]과(와) a["+(a.length-i)+"]를 교환합니다");
			System.out.println(a.length);
			System.out.println("a[0]"+a[0]+"a[4]"+a[4]+"출력확인");
			swap(a,i,a.length-i-1);
		}
		
		
	}
	
	
	public static void main(String[] args) {
	
		Scanner stdIn= new Scanner(System.in);
		int num = stdIn.nextInt();
		int [] x= new int[num];
		for(int i=0; i<num;i++) {
			//System.out.print("x["+i+"] :");
			x[i]=stdIn.nextInt();			
		}
		reverse(x);
		
		for(int i = 0; i<num; i++) {
			System.out.print(x[i]);
		}
		System.out.println("역순 정렬을 마쳤습니다.");
	
	}
	
	

}
