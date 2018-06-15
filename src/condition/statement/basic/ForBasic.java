package condition.statement.basic;

import java.util.Scanner;

public class ForBasic {
	
	public void demo01() {
		
		int num, product;
		for (num = 1; num <= 2; num++) {
			product = num * 2;
			System.out.println("Value of product = " + product);
		}
		System.out.println("----------------------");
	}
	
	
	public void demo2() {
		
		int i, j;
		int max = 5;
		for (i = 0, j = max; i < max; i++, j--) {
			System.out.printf("\n%d + %d = %d", i, j, i + j);
		}
		System.out.println("\n----------------------");
	}
	
	
	public void demo3() {
		
		int num = 1;
		boolean flag = false;
		for (; !flag; num++) {
			System.out.println("Value of num: " + num);
			if (num == 5) {
				flag = true;
			}
			
		}
		System.out.println("----------------------");
	}
	
	
	public void demo4() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string: ");
		String[] str = new String[2];
		
		for (int i = 0; i < str.length; i++) {
			System.out.printf("String %d: ", i + 1);
			str[i] = input.nextLine();
		}
		
		System.out.println("\nList of string: ");
		for (String s : str) {
			System.out.printf(s +"\n");
			
		}
	}
	
	public void demo5() {
		int row, col;
		for (row = 1; row <=5; row++) {
			for (col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		ForBasic f = new ForBasic();
		f.demo01();
		f.demo2();
		f.demo3();
		//f.demo4();
		f.demo5();
		
	}
	
}
