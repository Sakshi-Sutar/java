public class TypeCasting
{
	public static void main(String[] args)
	{
		int x=5;
		float y=x;					//widening casting - automatic conversion from int to float

		System.out.println(x);
		System.out.println(y);

		float p=6.7f;
		int q=(int) p;					//narrowing casting - manual conversion needed

		System.out.println(p);
		System.out.println(q);
	}
}



/* OUTPUT

5
5.0
6.7
6

*/
