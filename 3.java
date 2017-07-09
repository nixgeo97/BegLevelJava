/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char x,a,e,i,o,u;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter alphabet");
		x=s.next().charAt(0);
		if(x== 'a'||x=='e'||x=='i'||x=='o'||x=='u')
		{
		System.out.println("Vowels");
		}
		else
		{
		System.out.println("Consonants");
		}
	}
}
