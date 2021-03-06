package bj_algorithm;
import java.util.Scanner;
import java.io.*;

public class dp_fibonacci_bw {
	
	private static StringBuilder sb = new StringBuilder();

	static int[] zero = new int[41];
	static int[] one = new int[41];

	
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner stdIn = new Scanner(System.in);
		int T = stdIn.nextInt();
		zero[0]=1;
		one[1]=1;
		
		for (int i=2; i<=40; i++) {
			zero[i]=zero[i-1]+zero[i-2];
			one[i]=one[i-1]+one[i-2];
		}
		
		for (int i=0; i<T; i++) {
			int n = stdIn.nextInt();
			bw.write(zero[n] + " " + one[n] + "\n");
		}
		bw.flush();
		bw.close();
	}
}
