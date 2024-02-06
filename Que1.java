/*Have the function ABCheck(str) take the str parameter being passed 
 * and return the string true if the characters a and b are separated 
 * by exactly 3 places anywhere in the string at least once 
 * (ie. "lane borrowed" would result in true because there is exactly 
 * three characters between a and b). Otherwise return the string false.
 * */
package technicalQue;

public class Que1
{

	public static boolean ABCheck(String str) 
	{
		int idx;
		if(str.contains("a"))
		{
			idx=str.indexOf("a");
			if(idx+4<str.length()) {
				char Check=str.charAt(idx+4);
				if(Check=='b') 
				{
					return true;
				}
			}
			
		}
		return false;
		
	}
	public static void main(String[] args)
	{
		boolean res=ABCheck("lane borrowed");
		System.out.println(res);
	}

}
