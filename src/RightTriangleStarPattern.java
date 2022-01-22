public class RightTriangleStarPattern {

	public static void StarRightTriangle(int n) {
		// TODO Auto-generated method stub
		int a, b;
		for (a = 0; a < n; a++) //outer loop to handle numbers of rows
		{
			for (b = 0; b<= a; b++) // inner loop
			{
				//printing stars
				System.out.print("* ");
			}
			// end-line
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int k = 5;
		StarRightTriangle (k);
	}
}
