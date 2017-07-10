/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int i,x,a=0;
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER NATURAL NUMBER TILL WHICH SUM IS TO BE FOUND:");
        x=s.nextInt();
        for(i=1;i<=x;i++)
        {
        a=a+i;
        }
        System.out.println("SUM OF NATURAL NUMBERS:"+a);
	}
}