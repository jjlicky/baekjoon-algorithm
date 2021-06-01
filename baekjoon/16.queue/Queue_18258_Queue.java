package bj_algorithm;
import java.util.*;
import java.io.*;
public class Queue_18258_Queue {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<Integer>();
		//ArrayList<Integer> queue = new ArrayList<Integer>(); --> ArrayList ����
		String str = null;
		String command = null;
		int rear = 0;
		// Queue�� �ǵ��� ��Ҹ� ��ȯ�ϴ� �޼ҵ尡 �����Ƿ� push��ɿ��� ���� �������� �ԷµǴ� ���� rear�� ����
		// back ��ɾ� �Է½� ����� rear���� ����ϵ��� ��.
		
		for (int i=0; i<n; i++) {
			str = br.readLine();
			StringTokenizer st = new StringTokenizer(str); // ���ڿ� �ɰ��� ����
			command = st.nextToken();
			
			if (command.equals("push") && st.hasMoreTokens()) {
				int value = Integer.parseInt(st.nextToken());
				queue.add(value);
				rear = value;
			} else if (command.equals("front")) {
				if (!queue.isEmpty()) {
					bw.write(queue.peek() + "\n");
				} else {
					bw.write(-1 + "\n");
				}
			} else if (command.equals("back")) {
				if (!queue.isEmpty()) {
					bw.write(rear + "\n");
				} else {
					bw.write(-1 + "\n");
				}
			} else if (command.equals("pop")) {
				if (!queue.isEmpty()) {
					bw.write(queue.poll() + "\n");
				} else {
					bw.write(-1 + "\n");
				}
			} else if (command.equals("empty")) {
				if (queue.isEmpty()) {
					bw.write(1 + "\n");
				} else {
					bw.write(0 + "\n");
				}
			} else if (command.equals("size")) {
				bw.write(queue.size() + "\n");
			} else {
				System.exit(0);
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}

