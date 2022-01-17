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

3 3
bmw
1
3
8

*/
