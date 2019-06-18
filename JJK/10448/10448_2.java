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
		
		for(int i = 0 ; i < t; i++) {
			int num = test[i];
			boolean flag = false;
			
			for(int j = 1; j < 45; j++) {
				for(int k = 1; k < 45; k++) {
					for(int l = 1; l < 45; l++) {
						if(num == table[l] + table[k] + table[j]) {
							result[i] = 1;
							flag = true;
							break;
						}
							
					}
					if(flag)break;
				}
				if(flag)break;
			}
			System.out.println(result[i]);
		}
		
	}
	
	
}
