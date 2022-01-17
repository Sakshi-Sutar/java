public class Array
{
	public static void main(String[] args)
	{
		String[] cars={"bmw","ford","volvo"};
		int[] arr={1,3,8};

		System.out.println(cars.length + " " + arr.length);		//'length' property gives array length

		System.out.println(cars[0]);
		for(int i: arr)
			System.out.println(i);
	}
}


/* OUTPUT

C:\Users\Sakshi Sutar\codes\java>javac Array.java

C:\Users\Sakshi Sutar\codes\java>java Array
3 3
bmw
1
3
8

C:\Users\Sakshi Sutar\codes\java>

*/