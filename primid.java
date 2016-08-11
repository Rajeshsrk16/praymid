# praymid

public class primid {
	public static void main(String[] args)
	{
		Scanner scr=new Scanner (System.in);
		int n=scr.nextInt();
		for(int i=1;i <=n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}	
			for(int k=1;k<i+1;k++)
			{
				System.out.print("*");		
			}
			System.out.println("  ");


		}
	}
