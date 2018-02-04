package HomeWork;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int numb;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 5-th number");
		numb = scan.nextInt();

		int firstNum = (numb / 10000);
		int secondNum = (numb % 10000/1000);
		int thirdNum = (numb % 1000/100);
		int fourthNum = (numb % 100/10);
		int fifthNum = (numb % 10/1);

		System.out.println(firstNum);
		System.out.println(secondNum);
		System.out.println(thirdNum);
		System.out.println(fourthNum);
		System.out.println(fifthNum);
		
	}

}
