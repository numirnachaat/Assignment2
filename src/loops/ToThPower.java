package loops;

import java.util.Scanner;

public class ToThPower {
public static void main(String[] args) {
//	 Scanner sc=new Scanner(System.in);
//     int num = 0;
//     int pow = 0;
//     int power = 0;
//
//     System.out.print("Enter number: ");
//     num = sc.nextInt();
//
//     System.out.print("Enter power: ");
//     pow = sc.nextInt();

     System.out.print(toThePower(2,4));
			
	}
public static int toThePower(int a, int b)
{
    int power = 1;

    for(int i = 0; i < b; i++)
        power =power*a;

    return power;
}
	  
}

