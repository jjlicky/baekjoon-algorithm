

class Digits
{
	public static void main(String[] args)
	{
		
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("2�ڸ� ������ �Է��ϼ���.");
		
		do{
			System.out.print("�Է� : ");
			n = stdIn.nextInt();
		}while(n<10 || n>99);
		
		System.out.println(n);

	}
}