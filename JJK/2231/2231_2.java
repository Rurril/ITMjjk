package question2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int temp = n;
		int result = 0;
		int count = 0;
		
		while(temp != 0) {
			count++;
			temp /= 10;
		}
		
		temp = n;
		count *= 9;
		
		while(temp > 0 || count > 0) {
			temp--;
			count --;
			
			int a = temp;
			int b = temp;
			
			while(b != 0) {
				a += b%10;
				b /= 10;
			}
			
			if(a == n) {
				result = temp;
			}	
		}
		System.out.println(result);
	}
}
