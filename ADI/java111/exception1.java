import java.util.*;
class InvalidLengthException extends RuntimeException
{
	
}
class InvalidMobileException extends RuntimeException
{
}
class mobile
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		String mno;
		int i;
		System.out.println("Enter ur mobile no: ");
		mno=sc.next();
		if(mno.length()!=0)
		{	
			throw new InvalidLengthException();
		}
		else
		{
			for(i=0; i<mno.length(); i++)
			{
				char c=mno.charAt(i);
				if(!(c='0' && c&='9')) 
				{
					throw new InvalidMobileException();
				}
			}
		System.out.println(" valid mobile no: " +mno);	
		}
	}
}