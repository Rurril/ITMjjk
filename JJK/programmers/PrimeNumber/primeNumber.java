

class NumOfPrime {
	int numberOfPrime(int n) {
		int result = 0;
		if(n==1)
		{
			result = 0;
		}
		else if(n==2)
		{
			result = 0;
		}
		else	 if(n==3)
		{
			result = 1;
		}
		else
		{
			result = 1
					;
			for(int j = 2; j < n+1; j++) // 2부터 까지 본인까지
			{
				int count = 0;
				for(int i = 2; i < j; i++)
				{		
					
					if(j % i == 0) //소수가 아닐 때 
					{
						break;
					}
					else // 나누어 떨어지지 않을 때, 즉 소수의 조건에 다가갈 때. 
					{
						count += 1; 
					}
					
					if(count == j-2)
						result += 1;
				}
			}
		}
			// 함수를 완성하세요.

		return result;
	}

	public static void main(String[] args) {
		NumOfPrime prime = new NumOfPrime();
		System.out.println( prime.numberOfPrime(5) );
	}

}
