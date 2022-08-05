package chap01;

public class test {

	public static void main(String[] args) {
		for (int i=1; i<=9;i++) {
			for(int j=2; j<=9;j++) {
				System.out.print(j+"x"+i+"="+j*i+"  ");
			if(i*j<10) {
				System.out.print(" ");
			}
								
			}
			System.out.println();
		}
	}

}
