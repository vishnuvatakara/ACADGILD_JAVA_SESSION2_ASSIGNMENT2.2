
public class Print {
int x=97;
int n=3;
public void display()
{	for(int i=0;i<3;i++)
		{
			for(int j=n;j>0;j--)
		
				{
					System.out.printf(" ");
				}
			n=n-1;
			for(int k=0;k<=i;k++)
			{
				System.out.print((char) x);
				x=x+1;
			}
			for(int k=0;k<=i;k++)
			{	
				if(x!=98)
				{
				x=x-1;
				int y=x-1;
				System.out.print((char) y);
				}
			}
			x=97;
			System.out.printf("\n");
			
			}
x=97;
for(int i=0;i<2;i++)
{
	for(int j=0;j<=i+1;j++)
	{
		System.out.print(" ");
	}
	for(int k=2;k>i;k--)
	{
		System.out.print((char) x);
		x=x+1;
	}
	for(int k=0;k<1;k++)
	{	
		if(x!=98)
		{
		x=x-1;
		int y=x-1;
		System.out.print((char) y);
		}
	x=97;
	System.out.print("\n");
}
}
		
}
public static void main(String args[])
{
	Print obj=new Print();
	obj.display();
}
}
