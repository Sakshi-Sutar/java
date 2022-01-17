public class StringObj
{
	public static void main(String[] args)
	{
		String txt="AabdefgH";
		System.out.println("String length: " + txt.length());
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());

		String location="please locate where locate occurs";
		System.out.println(location.indexOf("locate"));				//gives first occurence of specified text; starts from 0 including white spaces

		String firstName="John",lastName="Watson";
		System.out.println(firstName + lastName);
		System.out.println(firstName.concat(lastName));

		System.out.println("This \\ is for backslash and this \" \" is for double quotes");		//special characters

		String x="10";
		int y=20;
		System.out.println(x+y);									//combining string and number gives concatenation of the two
	}
}



/* OUTPUT

String length: 8
AABDEFGH
aabdefgh
7
JohnWatson
JohnWatson
This \ is for backslash and this " " is for double quotes
1020

*/