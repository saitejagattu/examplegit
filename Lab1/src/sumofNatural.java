import java.util.Scanner;
public class sumofNatural {

	public static void main(String[] args) {
		sumofNatural total= new sumofNatural();
		System.out.println("sum of first n natural nubers :"+total.calculateSum());
		

	}
	int calculateSum()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0||i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

}
