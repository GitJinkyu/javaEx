package forEx;

public class Ex04_05 {

	public static void main(String[] args) {
		
		for(int i=1;i<5;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("==============");
		
		for(int i=1;i<5;i++) {
			for(int j=4;j>0;j--) {
				if(j>i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}

}
