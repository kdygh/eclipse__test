package test_240715;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("===========1번============");
		
//		1.		
		int[][] arr = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("\n===========2번============\n");
		System.out.println();
		
//		2.
		int[][] arr2 = new int[4][5];
		
		int cnt2 = 1;
		int num2 = 1;
		
		for(int i = 0; i < arr2.length; i++)
		{
			if(cnt2 % 2 == 0)
			{
				for(int j = arr2[i].length - 1; j >= 0 ; j--)
				{
					arr2[i][j] = num2++;
				}	
			}
			else
			{
				for(int j = 0; j < arr2[i].length; j++)
				{
					arr2[i][j] = num2++;
				}	
			}
			cnt2++;
		}
		
		for(int i = 0; i < arr2.length; i++)
		{
			for(int j = 0; j < arr2[i].length; j++)
			{
				System.out.printf("%3d ", arr2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("===========3번============");
		System.out.println();
		
//		3.
		int [][] arr3 = new int[4][5];
		
		int num3 = 1;
				
		for(int i = arr3[0].length - 1; i >= 0; i--)
		{			
			for(int j = arr3.length - 1; j >= 0 ; j--)
			{				
				arr3[j][i] = num3++;
			}
		}
		
		for(int i = 0; i < arr3.length; i++)
		{
			for(int j = 0; j < arr3[i].length; j++)
			{
				System.out.printf("%3d ", arr3[i][j]);
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("===========4번============");
		System.out.println();
		
//		4.
		int [][] arr4 = new int[4][5];
		
		int num4 = 1;
				
		for(int cnt4 = 0; cnt4 <= arr4.length; cnt4++)
		{			
			for(int j = 0; j < arr4.length; j++)
			{				
				arr4[j][cnt4] = num4++;
			}
		}
		
		for(int i = 0; i < arr4.length; i++)
		{
			for(int j = 0; j < arr4[i].length; j++)
			{
				System.out.printf("%3d ", arr4[i][j]);
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("===========5번============");
		System.out.println();
		
//		5.
		int[][] arr5 = {{1, 2, 3, 4}, {5, 6, 7}, {8, 9}, {10}};
		
		for(int i = 0; i < arr5.length; i++)
		{
			for(int j = 0; j < arr5[i].length; j++)
			{
				System.out.printf("%3d ", arr5[i][j]);
			}
			System.out.println();
		}
	}

}