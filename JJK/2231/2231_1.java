package question2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int temp = n;
		int count = 0; // 10의 몇 승인지를 알기 위함. 
		
		while(true) {
			if(temp<10)
				break;
			temp /= 10;
			count++;
		}
		
		int result = 0;
		
		if(n <= 20) {
			for(int i = 1; i < 20; i++) {
				if(i + i/10 + i%10 == n) {
					result = i + i/10 + i%10;
					break;
				}
			}
		}else if(count == 1) { // 10의 자리의 경우. 
			for(int i = n-18; i < n; i++) {
				if(i + i/10 + i%10 == n) {
					result = i + i/10 + i%10;
					break;
				}
			}
		}
		
		
	}	

}
