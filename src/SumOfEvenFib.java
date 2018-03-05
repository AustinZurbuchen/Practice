import java.util.ArrayList;

// prints Sum of even Fibonacci numbers up to 4 million
public class SumOfEvenFib {
	public static ArrayList<Integer> fib = new ArrayList<Integer>();
	public static void main(String[] args){
		generateFibonacci();
		int result = getSumOfEven();
		System.out.println(result);
	}
	
	public static void generateFibonacci(){
		int prev = 2;
		int prev2 = 1;
		int sum = 0;
		fib.add(prev2);
		fib.add(prev);
		while(prev <= 4000000){
			sum = prev + prev2;
			fib.add(sum);
			prev2 = prev;
			prev = sum;
		}
	}
	
	public static int getSumOfEven(){
		int sum = 0;
		for(int i = 0; i < fib.size(); i++){
			if(fib.get(i) % 2 == 0){
				sum += fib.get(i);
			}
		}
		return sum;
	}
}
