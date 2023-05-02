package loops;

import java.util.Scanner;

public class MyMath04 {
public static void main(String[] args) {
	printTable(6);
	
	  }
	  public static int printTable(int num) {
		//  Scanner in = new Scanner(System.in);
		   
		//  System.out.print("Input a number: ");
		//   num = in.nextInt();
		  for(int i = 0;i< num;i++) {
			  System.out.println(num +" x "+(i+1)+" = "+(num*(i+1)));
			
	  }
		return num;
}
}
