package loofing;

public class Star {

	public static void main(String[] args) {
		
		
		for(int i=1;i<5;i++){
			for(int e=0;e<i;e++){
				System.out.print("*");
				
			}
			System.out.println("");
		}
		
		
		
		
		for(int i=1;i<5;i++){
			for(int j=4;j>0;j--){
				if(i<j){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

}
