import java.util.ArrayDeque;
import java.util.HashMap;

public class BalancedParenthesis {

	public static boolean isBalancedParenthesis(String s) {
		ArrayDeque<Character> opening = new ArrayDeque<>();
		HashMap<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		if(s.length() % 2 != 0) {
			return false;
		}
		for(char c : s.toCharArray()) {
			if(c == '(' || c == '[' || c == '{') {
				opening.push(c);
			}else {
				//System.out.println(opening.pop() + " " + c);
				if(opening.size() != 0 && c != map.get(opening.pop())) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = isBalancedParenthesis("{}([()])");
		System.out.println(x);
	}

}
