import java.util.Scanner;

class JudgeSign
{
	public static void main(String[] args)
	{
		
		Scanner stdIn = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� : ");
		int n = stdIn.nextInt();
		
		if(n>0)
			System.out.print("���");
		else if(n<0)
			System.out.print("����");
		else
			System.out.print("0");
	}
}