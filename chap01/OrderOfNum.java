import java.util.Scanner;

class OrderOfNum
{
	public static void main(String[] args)
	{
		
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("�Է��� ������ �ڸ����� ���մϴ�...");
		System.out.print("n�� �� �Է� : ");
		n = stdIn.nextInt();
		int a=0;
		while(n!=0)
		{
			n/=10;
			a++;
		}
		
		System.out.println(a);

	}
}