package sort;

public class insertion_Sort{
	public static void main(String[] args) {
		int i, j, temp;
		int number[] = {1,10,5,8,6,3,7,9,4,2};
//		for(i=0;i<number.length;i++) {
//			for(j=0;j<9;j++) {
//				if(number[j] > number[j+1]) {
//					temp = number[j];
//					number[j] = number[j+1];
//					number[j+1] = temp;
//				}
//			}
//		}
//		for(i=0;i<number.length;i++) {
//			System.out.println(number[i]);
//		}
		for(i=0;i<9;i++) {
			j=i;
			while(number[j] > number[j+1]) {
				temp = number[j];
				number[j] = number[j+1];
				number[j+1] = temp;
				j--;
			}
		}
		for(i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		
	}
	
}