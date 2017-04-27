class AlphabetK
{
	public static void main(String[] args) 
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
