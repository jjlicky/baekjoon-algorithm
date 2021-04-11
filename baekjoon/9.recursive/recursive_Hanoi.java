package bj_algorithm;
import java.util.Scanner;
import java.util.Vector;

// ����Ȱ�� !! arraylist������ �������� ũ�Ⱑ ���ϴ� ����. ����
public class recursive_Hanoi {

	
	static int cnt = 0;
	static Vector num1 = new Vector<Integer> ();
	static Vector num2 = new Vector<Integer> ();
	
	static void hanoi (int no, int x, int y) {
		
		if	(no>1) hanoi(no-1,x,6-x-y);
		
		num1.add(x);
		num2.add(y);
		
		if	(no>1) hanoi(no-1,6-x-y,y);
		
		cnt ++;
		
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		hanoi(n,1,3);
		System.out.println(cnt);
		for(int i=0; i<num1.size(); i++) {
			System.out.println(num1.get(i) + " " + num2.get(i));
		}
	}
}
