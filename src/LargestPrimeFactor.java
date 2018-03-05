import java.util.ArrayList;
import java.util.Scanner;

public class LargestPrimeFactor {
	public static ArrayList<Long> factors = new ArrayList<Long>();
	public static long number;
	public static long result;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number to get larges prime factor of: ");
		number = in.nextLong();
		//loadFactors();
		result = findLargestPrime();
		System.out.println(result);
		in.close();
	}
	
	public static long findLargestPrime(){
		for(long i = number; i >= 0; i--){
			System.out.print("Checking isPrime of " + i);
			if(number % i == 0 && isPrime(i)){
				return i;
			}
		}
		return 0;
	}
	
//	public static void loadFactors(){
//		System.out.println("Loading Factors");
//		for(long i = 1; i < number / 2; i++){
//			System.out.println(factors.size());
//			if(number % i == 0){
//				factors.add(i);
//			}
//		}
//	}
//	
//	public static long findLargestPrime(){
//		System.out.println("Finding largest Prime");
//		long largestPrime = 0;
//		for(int i = 0; i < factors.size(); i++){
//			if(isPrime(factors.get(i))){
//				largestPrime = factors.get(i);
//			}
//		}
//		return largestPrime;
//	}
//	
	public static boolean isPrime(long num){
		int sqrt = (int) Math.sqrt(num) + 1;
		System.out.println("Checking if prime, sqrt: " + sqrt);
		for(int i = 2; i < sqrt; i++){
			System.out.println("in for loop index: " + i);
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}

}
