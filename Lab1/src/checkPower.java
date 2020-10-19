import java.util.Scanner;
import java.lang.Math;
public class checkPower {

	public static void main(String[] args) {
		checkPower number=new checkPower();
		System.out.println("check number power of two "+number.checkNumber());

	}
	public boolean checkNumber()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r;
		if(n<=0)
		{
			return false;
		}
		while(n>0)
		{		
			n=n/2;
			if(n%2!=0&&n!=1)
			{
				return false;
			}
		}
		return true;
		
	}

}
