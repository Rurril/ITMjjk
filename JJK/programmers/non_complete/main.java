
public class main {
	//구현 못한 부분 : 동명이인인 경우...? 
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		for(int i = 0; i < participant.length; i++) {
			String check = participant[i];
			for(int j = 0; j < completion.length; j++) {
				if(check == completion[j])break;
				if(j+1 == completion.length)answer += check;
			}
		}
    
    return answer;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"leo", "kiki", "eden"};
		String[] b = {"eden", "kiki"};
		String c;
		
		c = solution(a,b);
		System.out.println(c);
	}

}
