import java.util.Scanner;

class SumOfTwoInt
{
	static int sumof(int a, int b)
	{	
		int sum=0;
		if(a>=b)
			for(int i=b+1;i<a;i++)
				sum+=i;
		else
			for(int i=a+1;i<b;i++)
				sum+=i;
		return sum;
	}

	public static void main(String[] args)
	{
		
		Scanner stdIn1 = new Scanner(System.in);
		Scanner stdIn2 = new Scanner(System.in);

		System.out.println("n1���� n2������ ���� ���մϴ�.");
		System.out.print("n1�� �� �Է� : ");
		int n1 = stdIn1.nextInt();
		System.out.print("n2�� �� �Է� : ");
		int n2 = stdIn2.nextInt();
		
		int sum = sumof(n1,n2);
		

		
		System.out.println(sum);

	}
}