package controlstatement;

import java.util.Scanner;

public class Print_positive_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			n=sc.nextInt();
		if(n>=0) {
			System.out.println(n);
		}
		}while(n<=0);
	}

}
