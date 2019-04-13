package question1068;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


public class Main {
	
	static int index = 0; // 리프노드의 개수.
	
	static void count(int start, ArrayList[] al) {
		//차례대로 자식들의 여부를 확인한다.
		int size = al[start].size();
		
		if(al[start].size() == 0)
			index++;
		
		for(int i = 0; i < size; i++) {
			count((int)al[start].get(i), al);
		}
	}
	
	static ArrayList[] delete(ArrayList[] al, int[] parentNum, int deleteNum) {
		//지우는 노드의 부모를 찾아서 부모의 자식 노드 저장을 제거하면 된다.
		
		int num = parentNum[deleteNum];
		int a = al[num].indexOf(deleteNum);
		al[num].remove(a);
		
		return al;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		ArrayList[] al = new ArrayList[50];
		
		for(int i = 0; i < 50; i++) {
			al[i] = new ArrayList();
		}
		
		int nodeNumber = Integer.parseInt(br.readLine());
		int[] parentNum = new int[nodeNumber];
		
		// 인트를 다 한 번에 받는 것이 안된다면, 차라리 받아서 split으로 나누어 버리곘다.
		for(int i = 0; i < nodeNumber; i++) {
			parentNum[i] = sc.nextInt(); //부모 인덱스에 대한 정보.
			if(parentNum[i] != -1)
				al[parentNum[i]].add(i); // 자식 노드들에 대한 정보. 
		}
		
		
		int deleteNum = sc.nextInt();
		
		delete(al, parentNum, deleteNum);
		count(0, al);
		System.out.println(index);

		
		br.close(); 
		
		
		
		
	}

}
