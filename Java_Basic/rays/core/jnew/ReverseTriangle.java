package rays.core.jnew;

public class ReverseTriangle {

	public static void main(String[] args) {
		
		for (int a = 10; a >= 1; a-- ) {
			
			for (int b = 1; b <= a; b++) {
				
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}