import java.util.Scanner;

public class sumofCubes {
	

	public static void main(String[] args) {
		
		sumofCubes value=new sumofCubes();
		System.out.println("sum of the cubes of the n digit number is "+value.cube());

	}
	int cube()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+(d*d*d);
			n=n/10;
		}
		
		return sum;
	}
	

}
