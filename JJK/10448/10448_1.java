package question10448;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int[] table = new int[45];

	public static int triangleNum(int num) {
		
		num = num*(num+1)/2;
		
		return num;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		table[0] = 1;
		for(int i = 1; i < 45; i++) {
			//System.out.print(i + " : ");
			table[i] = triangleNum(i);
			
		}
		
		//System.out.println(table[4]);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =	Integer.parseInt(br.readLine());
		int[] test = new int[t];
		int[] result = new int[t];
		
		for(int i = 0; i < t; i++) {
			test[i] = Integer.parseInt(br.readLine());
		}
		
		
		for(int i = 0; i < t; i ++) {
			int num = test[i];
			int temp = 0;
			result[i] = 0;
			// 딱 3개까지 넣기로 한 것이므로, 3번까지는 반복.
			for(int j = 0; j < 3; j++) {
				//temp가 num보다 작을 때까지만 반복.
				int count = 1;
				while(true) {
					System.out.println(temp);
					
					if(temp + table[count] > num) {  
						temp += table[count-1];
						break;
					}else if(temp + table[count] == num) {
						temp += table[count-1];
						break;
					}
					
					if(count == 44) { // 이 이상 넘어가면 배열 범위를 넘어서게 되므로 끝내야 한다. 
						temp += table[count];
						break;
					}
					
					count++;					
				}
				
				if(j == 2 && temp == num) {
					result[i] = 1; 
					break;
				}
			}
			//System.out.println("Result : " + temp);
			//System.out.println("Result boolean : " + result[i]);
			System.out.println(result[i]);
		}
		
	}
	
	
}
