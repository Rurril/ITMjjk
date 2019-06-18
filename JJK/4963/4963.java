package qestion4963;
//import java.io.BufferedWriter;
//import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static int map[][];
	public static int count;
	public static ArrayList<Integer> result = new ArrayList<>();

	public static void search(int x, int y) {
		map[x][y] = 0; // It means that I already check this point.
		// Checking near of the point.
		int dx[] = {-1, -1, -1, 0, 0, 1, 1, 1};
		int dy[] = {1, 0 , -1, 1, -1, 1, 0, -1};
		//TODO If the checking point is out of range, controlling the search function, it doesn't work
		for(int i = 0; i < 8; i++) {
			int x2 = x + dx[i];
			int y2 = y + dy[i];
			if(map[x2][y2] == 1) {
				search(x2, y2);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner sc = new Scanner(System.in);
			int w = sc.nextInt();
			int h = sc.nextInt();

			if(w == 0 && h == 0) {
				break;
			}
			map = new int[h+2][w+2];

			//Input the map.
			for(int i = 1; i < h+1; i++) {
				for (int j = 1; j < w+1; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			for(int i = 1; i < h+1; i++) {
				for (int j = 1; j < w+1; j++) {
					//If point is a land..
					if(map[i][j] == 1) {
						search(i, j);
						count++;
					}

				}
			}
			result.add(count);
			count = 0;

		}
		for(int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}


	}

}
