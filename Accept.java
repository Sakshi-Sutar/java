import java.util.Scanner;

public class Accept
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int x;

		String str;

		System.out.print("Enter x: ");
		x=sc.nextInt();

		sc.nextLine();

		System.out.print("Enter str: ");
		str=sc.nextLine();

		System.out.println();

		System.out.println("x: "+x);
		System.out.println("str: "+str);
	}
}


/* OUTPUT

D:\SAKSHI\codes\java>javac Accept.java

D:\SAKSHI\codes\java>java Accept
Enter x: 2
Enter str: hello world

x: 2
str: hello world

D:\SAKSHI\codes\java>

*/