import java.util.Scanner;

class GaussPlus
{
	public static void main(String[] args)
	{
		
		Scanner stdIn = new Scanner(System.in);

		System.out.print("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� �Է� : ");

		int n = stdIn.nextInt();
		
		int sum=0;
		sum= (1+n)*n/2;

		
		System.out.println(sum);

	}
}