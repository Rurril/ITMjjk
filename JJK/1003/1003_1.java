import java.util.Scanner;


public class Main {

	static int countOne = 0;
	static int countZero = 0;

	public static int fibonacci(int n) {
		if(n == 0) {
			//System.out.println("0");
			countZero++;
			return 0;
		}else if(n == 1) {
			//System.out.println("1");
			countOne++;
			return 1;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int[] arr = new int[testCase*2];


		for(int i = 0; i < testCase; i++) {
			countOne = 0;
			countZero = 0;

			int n = sc.nextInt();
			fibonacci(n);
			arr[i*2] = countZero;
			arr[i*2+1] = countOne;

			}

		for(int i = 0; i < testCase; i++) {
			System.out.println(arr[i*2] + " " + arr[i*2+1]);
		}
		sc.close();
	}

}
