import java.util.Scanner;

public class Main2 {

	public static int fibonacci(int n) {
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr = new int[t*2];

		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			if(n==0) {
				arr[i*2] = 1;
				arr[i*2+1] = 0;
			}else {
				arr[i*2] = fibonacci(n-1);
				arr[i*2+1] = fibonacci(n);
			}
		}

		for(int i = 0; i < t; i++) {
			System.out.println(arr[i*2] + " " + arr[i*2 + 1]);
		}

	}

}
