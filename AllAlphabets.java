class AlphabetA
{
	public static void printA() 
	{
		int n = 7;
		for (int row = 0;row < n ;row++ )
		{
			for (int col=0;col <= n/2;col++ )
			{
				if (col == 0||col == n/2||row == 0||row == n/2 )
				{
					System.out.print("A ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
class AlphabetB 
{
	public static void printB() 
	{
		
		int n = 7;
		for (int row = 0;row < n ;row++ )
		{
			for (int col=0;col <= n/2;col++ )
			{
				if (col == 0||col == n/2&&row != 0&&row != n/2&&row != n-1
					||(row == 0||row == n/2||row == n-1)&&col != n/2)
				{
					System.out.print("B ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
class AlphabetC 
{
	public static void printC() 
	{

		int n = 7;
		for (int row = 0;row < n ;row++ )
		{
			for (int col = 0;col <=n/2 ;col++ )
			{
				if (col == 0&&row != 0&&row != n-1||(row == 0||row == n-1)&&col != 0)
				{
					System.out.print("C ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}
class AlphabetD 
{
	public static void printD() 
	{

		int n = 7;
		for (int row = 0;row < n ;row++ )
		{
			for (int col = 0;col <=n/2 ;col++ )
			{
				if (col == 0||col == n/2&&row != 0&&row != n-1||(row == 0||row == n-1)&&col != n/2)
				{
					System.out.print("D ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}
class AlphabetG 
{
	public static void printG() 
	{

		int n = 7;
		for (int row = 0;row < n ;row++ )
		{
			for (int col = 0;col <=n/2 ;col++ )
			{
				if (col == 0&&row != 0&&row != n-1||(row == 0||row == n-1)&&col != 0&&col != n/2||row == n/2&&col != 1||col == n/2&&row > n/2&&row != n-1)
				{
					System.out.print("G ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}
class AlphabetK
{
	public static void printK() 
	{
		System.out.println("Prg starts...");
		int n = 7;
		for (int row = 0;row < n ;row++ )
		{
			for (int col = 0;col <=n/2 ;col++ )
			{
				if (col == 0||row + col == n/2||row ==n-1&&col==n/2||row==n-2&&col ==(n/2)-1||row==n-3&&col==(n/2)-2)
				{
					System.out.print("K ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("Prg ends...");
	}
}

class AllAlphabets 
{
	public static void main(String[] args) 
	{
		System.out.println("A to Z");
		System.out.println();
		System.out.println('A');
		System.out.println();
		AlphabetA.printA();
		System.out.println();
		System.out.println('B');
		System.out.println();
		AlphabetB.printB();
		System.out.println();
		System.out.println('C');
		System.out.println();
		AlphabetC.printC();
		System.out.println();
		System.out.println('D');
		System.out.println();
		AlphabetD.printD();
		System.out.println();
		System.out.println('G');
		System.out.println();
		AlphabetG.printG();

		System.out.println();
		System.out.println('K');
		System.out.println();
		AlphabetK.printK();

		
	}
}
