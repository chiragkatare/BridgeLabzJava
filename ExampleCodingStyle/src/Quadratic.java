
/******************************************************************************
 * Purpose: to to find the roots of the equation a*x*x + b*x + c. 
 *
 * @author chiragkatare
 * @version 1.0
 * @since 08-10-2018
 *
 ******************************************************************************/
import java.util.Scanner;

public class Quadratic {

	/**
	 * Function to find the roots of equation and print it
	 * 
	 * @param a value of a
	 * @param b value of b
	 * @param c value of c
	 */
	static void roots(int a, int b, int c) {
		int delta = b * b - 4 * a * c;
		double x1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);
		double x2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);
		System.out.println(x1);
		System.out.println(x2);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a ");
		int a = s.nextInt();
		System.out.println("enter b");
		int b = s.nextInt();
		System.out.println("enter c");
		int c = s.nextInt();
		roots(a, b, c);
	}
}