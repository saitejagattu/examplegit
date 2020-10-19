import java.util.Scanner;
public class checkNumber {

	public static void main(String[] args) {
		checkNumber check=new checkNumber();
		System.out.println("Check number increase or not:"+check.checkNum());

	}
	public boolean checkNum()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int lastnum=10;
		int present;
		if(n<0)
		{
			System.out.println("Not valid");
		}
		while(n>0)
		{
				present=n%10;
				if(lastnum<present)
				{
					return false;
				}
				lastnum=present;
				n=n/10;
		}
			return true;
	}

}
