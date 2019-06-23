package codingKitri;

public class week1 {
			
	static int yang = 1;
	static int so = 1;
	
	public static void value(int a, int b,int n,int w) {
		if(a==b && w==a*n) {
		   yang = n/2;
		   so = n/2;
		   System.out.println(yang +" "+ so);
		} else if(a!=b && Math.abs(w-b*n) >= Math.abs(a-b) && Math.abs(w-a*n) >= Math.abs(b-a))  {
			yang = (w - b*n) / (a-b);
			so = (w-a*n) / (b-a);
			System.out.println(yang +" "+ so);
		} else {
			System.out.println(-1);
		}		
	}
	public static void main(String[] args) {
		value(2,2,3,4);
	}
}