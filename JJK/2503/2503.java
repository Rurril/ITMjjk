import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	static int n;
	static int pos = 0; // 경우의 수
	static ArrayList<Integer[]> list = new ArrayList<Integer[]>();
	
	static Integer[][] number;
	static int[] ball;
	static int[] strike;
	
	public static void Counting(Integer[] test) {
		for(int i = 0; i < n; i++) { // 최종 몇 번 반복을 할거냐.
			
			// 볼 체크
			//처음에 test값은 123이 들어와있지
//			System.out.println(test[0] +" "+ test[1] + " " + test[2]);
//			System.out.println(number[i][0] +" "+ number[i][1] + " " + number[i][2]);
			
			int ballCount = 0;
			
			if(test[0] == number[i][1] || test[0] == number[i][2])ballCount++;
			if(test[1] == number[i][2] || test[1] == number[i][0])ballCount++;
			if(test[2] == number[i][0] || test[2] == number[i][1])ballCount++;
			
//			System.out.println(ballCount);
			
			if(ballCount != ball[i]) //break만 할게 아니라, 아에 전체 카운팅에 포함을 하면 안되지.
				break; 
			
			int strikeCount = 0;
			if(test[0] == number[i][0])strikeCount++;
			if(test[1] == number[i][1])strikeCount++;
			if(test[2] == number[i][2])strikeCount++;
			
			if(strikeCount != strike[i])
				break;
			
			
			if(i == n-1) {
				pos++; //여기까지 왔다면, 모든 경우의 수를 통과하고 온 것이므로.
//				System.out.println(test[0] +" "+ test[1] + " " + test[2]);
			}
		}
	}
	// TODO 
	// counting하는 메소드를 완성시키고, 볼은 자신 말고 다른 곳의 숫자들과 같은지 스트라이크는 각 존에서 같은지 확인하는 식으로 진행. 
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i =111; i < 1000; i++) {  
			Integer[] temp = new Integer[3];
			temp[0] = i/100;
			temp[1] = (i/10) % 10;
			temp[2] = i%10;
			
			if(temp[0] == temp[1] || temp[1] == temp[2] || temp[2] == temp[0])continue;
			if(temp[0] == 0 || temp[1] == 0 || temp[2] == 0)continue;
			
			list.add(temp);
		}
		
		n = Integer.parseInt(br.readLine());
		number = new Integer[n][3];
		ball = new int[n];
		strike = new int[n];
		
		//System.out.println(list.size()); //사이즈는 504
//		String a = "123 1 1";
//		String[] b = a.split(" ");
//		System.out.println(b[2] + "a");
		
		
		for(int i = 0; i < n; i ++) {
			String[] a = br.readLine().split(" ");
			int temp = Integer.parseInt(a[0]);
			number[i][0] = temp / 100;
			number[i][1] = (temp/10) % 10;
			number[i][2] = temp % 10; 
			strike[i] = Integer.parseInt(a[1]);
			ball[i] = Integer.parseInt(a[2]);
		}
		
		while(!list.isEmpty()) {
			Integer[] test = list.remove(0);
			//System.out.println(test[0] + " " + test[1] + " " + test[2]);
			Counting(test);
		}
		
//		System.out.println(strike[0] +" "+ strike[1] + " " + strike[2] + " " +strike[3]);
//		System.out.println(ball[0] +" "+ ball[1] + " " + ball[2] + " " + ball[3]);
//		System.out.println(number[0][0] +" "+ number[0][1] + " " + number[0][2]);
//		System.out.println(number[0].length);
		
		System.out.println(pos);
		
		
	}
}
