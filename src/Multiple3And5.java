import java.util.Scanner;

// Gets the sum of all the multiples of 3 and 5 given an upper bound
public class Multiple3And5 {
	public static int upperBound;
	public static int result;
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an upper bound: ");
		upperBound = scanner.nextInt();
		result = getSum();
		System.out.println(result);
	}
	
	public static int getSum(){
		int count = 0;
		for(int i = 0; i < upperBound; i++){
			if(i % 3 == 0 || i % 5 == 0){
				count += i;
			}
		}
		return count;
	}
}
