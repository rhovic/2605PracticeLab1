
public class Square {
	
	static void getSquare(int n) {
		for(int i=0; i < n || i==n; i++) {
			System.out.println("the square of "+ i + " is "+ i*i);
		}
	}
	
	//recursion
	static int getSquare2(int i, int n) {
		if(i < n || i==n) {
			System.out.println(i + ", " + i*i);
			return getSquare2(i + 1, n);
		}else {
			return 0;
		}
	}
}
