import java.util.Arrays;

public class LexicographicRankOfAString {

	public static void swap(char[] arr , int a , int b) {
		char temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static int factorial(int n) {
		int facto = 0;
		if(n == 0) {
			return 1;
		}
		facto = n * factorial(n - 1);
		return facto;
	}
	public static int lexicographicRankOfAString(char[] string , int index , int sum) {
		int count = 0;
		int fact = factorial(index+1);
		if(index == string.length) {
			return sum ;
		}
		if(index == 0) {
			sum = 0;
			return (sum + lexicographicRankOfAString(string, index+1, sum));
		}else {
			for(int i = string.length-index ; i < string.length ; i++) {
				if(string[i] < string[i-1]) {
					swap(string , i , i-1);
					count++;
				}
			}
			sum += (fact/(index+1))*count;
			if(index == 1) {
				sum+=1;
			}
			return (lexicographicRankOfAString(string, index+1, sum));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = lexicographicRankOfAString("DCBA".toCharArray(), 0, 0);
		System.out.println(x);
	}

}
