import java.util.Scanner;

class NumPira
{
	static void npira(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=n-i+1;j++)
				System.out.print(' ');
			for(int j=1; j<=(i-1)*2+1;j++)
				System.out.print(i%10);
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("�Ƕ�̵� ������� ��Ÿ���ϴ�.");

		do {
			System.out.print("�ܼ��� : ");
			n=stdIn.nextInt();
		}while(n<=0);

		npira(n);
	}
}