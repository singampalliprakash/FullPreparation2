package assignment;

public class FabnociiUsingRecursion {
static int nthFibo(int n){
        
        if (n <= 1) {
            return n;
        }
        
        return nthFibo(n - 1) + nthFibo(n - 2);
    }

	public static void main(String[] args) {
		 int n = 10;
	        int result = nthFibo(n);
	        System.out.println(result);
	        
	}
}





//10*fact()