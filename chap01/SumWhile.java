import java.util.Scanner;

class SumWhile
{
	public static void main(String[] args)
	{
		
		Scanner stdIn = new Scanner(System.in);

		System.out.print("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� �Է� : ");

		int n = stdIn.nextInt();
		
		int sum=0;
		int i=1;

		while(i<=n)
		{
			sum+=i;
			i++;
		}
		System.out.println(sum);

	}
}