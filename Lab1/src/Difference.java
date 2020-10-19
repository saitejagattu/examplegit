import java.util.Scanner;
import java.lang.Math;
public class Difference {

	public static void main(String[] args) {
		Difference diff=new Difference();
		System.out.println("diffrence between number is"+diff.calculateDifference());

	}
	public int  calculateDifference()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int sum1=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(i*i);
			sum1=sum1+i;
		}
		
		int difference=(sum1*sum1)-sum;
		return difference;
		//return sum;
	}

}
