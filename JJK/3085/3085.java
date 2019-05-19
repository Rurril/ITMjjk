import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static char[][] map;
	static int[][] check;
	static int length = 0;
	static int n;
	
	public static int max(int x, int y) {
	    return x > y ? x : y;
	}
	
	public static void checking(char[][] map){
		
			
			for (int i = 0; i < n; i++) {
				//System.out.println(length);
			        int cnt = 1;
			        for (int j = 1; j < n; j++) {
			        		
			            if (map[i][j] == map[i][j - 1]) {
			                ++cnt;
			            } else {
			                length = max(length, cnt);
			                cnt = 1;
			            }
			        }
			        length = max(length, cnt);
			    }
				 
			    for (int i = 0; i < n; i++) {
			        int cnt = 1;
			        for (int j = 1; j < n; j++) {
			            if (map[j][i] == map[j - 1][i]) {
			                ++cnt;
			            } else {
			                length = max(length, cnt);
			                cnt = 1;
			            }
			        }
			        length = max(length, cnt);
			    }
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		map = new char[n][n];
		check = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				check[i][j] = 1;
			}
		}
		
		for(int i = 0; i < n; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println();
		
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				System.out.print(check[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println();
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				
				char temp;
				
				//case 1: 오른쪽으로 
				if(j+1 != n) {
					if(map[i][j] != map[i][j+1]) {
						if(check[i][j+1] == 1) {
							temp = map[i][j];
							map[i][j] = map[i][j+1];
							map[i][j+1] = temp;
							checking(map);
							temp = map[i][j];
							map[i][j] = map[i][j+1];
							map[i][j+1] = temp;
						}
					}
				}
				
				
				//case 2: 왼쪽으로 
				if(j-1 != -1) {
					if(map[i][j] != map[i][j-1]) {
						if(check[i][j-1] == 1) {
							System.out.println(1132);
							temp = map[i][j];
							map[i][j] = map[i][j-1];
							map[i][j-1] = temp;
							checking(map);
						}				
					}
				}
				
				//case 3: 위쪽으로 
				if(i+1 != n) {
					if(map[i][j] != map[i+1][j]) {
						if(check[i+1][j] == 1) {
							temp = map[i][j];
							map[i][j] = map[i+1][j];
							map[i+1][j] = temp;
							checking(map);
							temp = map[i][j];
							map[i][j] = map[i+1][j];
							map[i+1][j] = temp;
						}						
					}
				}
				
				//case 4: 아래쪽으로 
				if(i-1 != -1) {
					if(map[i][j] != map[i-1][j]) {
						if(check[i-1][j] == 1) {
							temp = map[i][j];
							map[i][j] = map[i-1][j];
							map[i-1][j] = temp;
							checking(map);
							temp = map[i][j];
							map[i][j] = map[i-1][j];
							map[i-1][j] = temp;
						}						
					}					
				}
				
				check[i][j] = 0;
				
			}
		}
		
		System.out.println(length);
		
		
	}	

}
