
public class SubsetOfString {

	public static void subsetOfString(String s , String curr , int index) {
		if(index == s.length()) {
			System.out.println(curr);
			return;
		}
		subsetOfString(s, curr + "", index+1);
		subsetOfString(s, curr + s.charAt(index), index+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subsetOfString("ABC", "", 0);
	}

}
