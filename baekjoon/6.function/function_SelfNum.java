package bj_algorithm;

public class function_SelfNum {
	
	static int dn(int x) {
		
		int res=0;
		int sum=0;
		int div=x;
		
		while(true) {
			res = div%10;
			div/=10;
			sum+=res;
			if(div==0)
				return sum+x; 
		}
	}
	
	public static void main(String[] args) {
		
		int n=10000;
		boolean [] check = new boolean[10001]; // �⺻���� false
		int k;
		
		for(int i=1;i<=n;i++) {
			if(!check[i]) {
				k=i;		// k=1�� �ع����� 1���ͽ����ؼ� �������� �����ڸ� ã�ƹ����Ƿ� ����
				while(k<10000) {
					k=dn(k);
					check[k]=true;
				}
				System.out.println(i);
			}
		}
	}
}
