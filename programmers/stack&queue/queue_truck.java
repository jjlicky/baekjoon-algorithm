package programmers;
import java.util.*;

public class queue_truck {
	
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int temp_weight = 0, idx=0;
        // 3. �ٸ�, ť�� ����.
        Queue<Integer> queue = new LinkedList<>();           
        
        // 4. ������ Ʈ���� ������ ��� Ʈ���� �����Ű�� ���� ���� �ݺ�.
        while(true){
            // 5. ������ Ʈ���� �ٸ��� �ö��� ��, �����.
            if(idx == truck_weights.length)break;
            // 6. �ٸ��� �ִ� Ʈ���� ���� �����ϸ�, ������ Ʈ���� ���Ը� ���� �ٸ��� Ʈ�� ���� ���տ��� ���ش�.
            if(queue.size() == bridge_length){
                temp_weight-=queue.poll();                
            }
            // 7. ���� �ٸ��� Ʈ�� ���� ���� + �ٸ��� �ö󰡾� �ϴ� Ʈ���� ���� > �ٸ��� ������ ���.
            else if(temp_weight+truck_weights[idx]>weight){
                // 7-1. �ٸ��� ���̸� ����ϱ� ���� 0�� ���� �־� �ڸ��� ä���, 1�� ����.
                queue.offer(0);
                answer++;
            // 8. ���� �����ϰ�� �ٸ��� Ʈ���� �ö󰣴�.               
            }else{
                queue.offer(truck_weights[idx]);
                temp_weight+=truck_weights[idx];
                answer++;
                idx++;
            }            
        } 
        // 9. ������ Ʈ���� �ٸ��� �ö� ���¿��� �ٸ��� ���̸� �����ָ�, ��� Ʈ���� ����ϴµ� �ɸ� �ð�.
        return answer + bridge_length;
    }
}
