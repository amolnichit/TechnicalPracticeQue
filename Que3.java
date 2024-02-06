/*Have the function PowersofTwo(num) take the num parameter being passed
 *  which will be an integer and return the string true if it's a power of
 *   two. If it's not return the string false. For example if the input is 
 *   16 then your program should return the string true but if the input is
 *    22 then the output should be the string false.*/
package technicalQue;

public class Que3
{

	public static boolean PowersofTwo(int num) 
	{
		if(num==0 || num==1)
		{
			return false;
		}
		while(num>1)
		{
			if(num%2!=0)
			{
				return false;
			}
			num=num/2;
		}
		return true;
		
	}
	public static void main(String[] args)
	{
		System.out.println(PowersofTwo(16));
		System.out.println(PowersofTwo(22));

	}

}
