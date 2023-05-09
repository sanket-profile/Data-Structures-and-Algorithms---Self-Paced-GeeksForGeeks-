import java.util.ArrayList;

public class ReverseWordsInAString {

	public static String reverseWordsInAString(String s) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i)  == ' ') {
				list.add(i);
			}
		}
		list.add(s.length());
		list.add(0, -1);
		for(int i = list.size()-1 ; i >0 ; i--) {
			s += s.substring(list.get(i-1)+1,  list.get(i)) + " ";
		}
		return s.substring(s.length()/2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = reverseWordsInAString("abc");
		System.out.println(x);
	}

}
