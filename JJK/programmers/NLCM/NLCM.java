
import java.util.Arrays;

class NLCM {
	public long nlcm(int[] num) {
		Arrays.sort(num);
		long answer = 1;
		int denominator = 0;

		for(int i = 2; i <= num[0]; i++) {
			for(int j = 0; j < num.length; j++) {
				if(num[j] % i != 0)
					break;
				if(j == num.length-1)
					denominator = i;
			}
		}
		if(denominator != 0) {
			for(int i = 0; i < num.length; i++) {
				num[i] /= denominator;
			}
			answer *= denominator;
		}
		for(int i = 0; i < num.length; i++) {
			answer *= num[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		NLCM c = new NLCM();
		int[] ex = {52, 32, 29, 8, 24, 4, 71, 97, 71, 52};
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(c.nlcm(ex));
	}
}
