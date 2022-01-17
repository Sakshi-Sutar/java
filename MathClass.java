public class MathClass
{
	public static void main(String[] args)
	{
		System.out.println(Math.max(5,4));
		System.out.println(Math.min(5,4));
		System.out.println(Math.sqrt(64));
		System.out.println(Math.abs(-7));

		System.out.println(Math.random());				//returns random numbers between 0.0 to 1.0(exclusive)
		System.out.println((int)(Math.random()*101));			//returns random numbers between 0 to 100(inclusive)
	}
}


/* OUTPUT

5
4
8.0
7
0.8610689647588134
66



5
4
8.0
7
0.6965672643899194
100

*/
