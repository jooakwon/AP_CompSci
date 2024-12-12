package pkg;

public class CVMath {	
	public static boolean perfectSquare(int a){
		int x = (int)Math.sqrt(a);
		return x*x == a;
	}
	public static void specialSquare(int b){
		int n = 1;
		int count = 0;
		while(count<=b){
			int sum = (n*(n+1))/2;
			if(perfectSquare(sum)){
				System.out.println(sum);
				count = count + 1;
			}
			n = n + 1;
		
		}
		
		
	}
}
