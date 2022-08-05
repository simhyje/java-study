package chap01;

public class Mult99Table {

	public static void main(String[] args) {
		System.out.print("  ");
		System.out.print("|");
		for(int i=1;i<=9; i++) {
			for(int j=0;j<=8;j++) {
				System.out.print(j+1);

				
			System.out.print(i*(j+1));
			}
		}

	}

}
