import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class main {
	// 2309번 문제, 백설공주와 아홉 난쟁이들 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 먼저 입력을 받고, 그것들을 리스트에 저장하고, 그것을 비교하는 식으로...?
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> size = new ArrayList<Integer>();
		
		for(int i = 0; i < 9; i++) {
			int ting = Integer.parseInt(br.readLine());
			size.add(ting);
		}
		
		Collections.sort(size);
		
		int[] hundred = new int[2];
		hundred[0] = -1;
		hundred[1] = -1;
		
		for(int i = 0; i < size.size(); i++) {
			for(int j = 0; j < size.size(); j++) {
			
				if(i==j)
					continue;
				
				int sum = 0;
				for(int k = 0; k < size.size(); k++) {
					if(k == i || k == j)
						continue;
					sum += size.get(k);
				}
				
				if(sum == 100) {
					hundred[0] = i;
					hundred[1] = j;
					break;
				}
				
			if(hundred[0] > 0)
				break;
				
			}
		}
		
//		size.remove(hundred[0]);
//		size.remove(hundred[1]);
		
		//int result = 0;
		
		for(int i = 0; i < size.size(); i++) {
			if(i != hundred[0] && i != hundred[1]) {
				System.out.println(size.get(i));
				//result += size.get(i);
			}
		}
		//System.out.println(result);
		//System.out.println("One : " + hundred[0] + " Two : " + hundred[1]);
	}

}
