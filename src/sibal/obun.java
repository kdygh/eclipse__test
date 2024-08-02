package sibal;

public class obun {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[][] arr = new int[4][5];
		
		int num = 1;
		
		for(int i = 0; i <= arr.length; i++)
		{
			for(int j = 0; j <= arr.length - 1; j++)
			{
				arr[j][i] = num++;
			}
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j <arr[i].length; j++)
			{
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
