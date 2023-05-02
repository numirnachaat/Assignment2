package loops;
import java.util.Scanner;
public class CopiesNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("How many copies you want to print?");
	
	int number = sc.nextInt();
	if (!(number <=0)) {
		for(int i=1; i<=number;i++)
		
		System.out.println(i);
	
	}
}
}
