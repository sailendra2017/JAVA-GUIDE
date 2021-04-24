package practice1;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] test1 = {{1,2,3,4,4,5,3},{3,3,4,55,2,2,5,43,2,23,2,4}};
		for(int i=0; i<test1.length; i++)
		{
			for(int j=0; j<test1[i].length; j++)
			{
				System.out.println("Value is "+ test1[i][j]);
			}

		}
	}

}
