package loops;

import java.util.Scanner;

public class FibonacciSequence {
public static void main(String[] args) {
//	int n1 = 0, i = 0, n2 = 1, n3, count = 10;
//	System.out.print(n1 + " " + n2);
//	for (n1 = 2; i < count; i++) {
//		n3 = n1 + n2;
//		System.out.print(" " + n3);
//		n1 = n2;
//		n2 = n3;
		Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
       int  i=1;
        		 int fact=1;
        		 while(i<=num) {
        			 fact = fact*i;
        			 i++;
        		 }
        		 System.out.println("Factorial of the number: "+fact);
	}
}

