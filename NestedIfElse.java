package conditionalStatements;

public class NestedIfElse 
{

	public static void main(String[] args)
	{
		int a=12;
		int b=10;
		int c=90;
		int ans=0;
		if(a>b)            // c1
		{
			/*
			 * enter the block when c1 is true
			 */
			
			if(a>c)       //c2
			{
				/*
				 * enter the block when c1 and c2 is true
				 */
				ans=a;
			}
			else
			{
				/*
				 * enter the block when c1 is true but c2 is false
				 */
				ans=c;
			}
		}
		else
		{
			/*
			 * enter the block when c1 is false
			 */
			if(b>c)          //c3
			{
				/*
				 * enter the block when c1 false but c3 is true
				 */
				ans=b;
			}
			else
			{
				/*
				 * enter the block when c1 and c3 is false
				 */
				ans=c;
			}
		}
		System.out.println("Greatest of three is "+ans);

	}

}

//Greatest of three is 90
