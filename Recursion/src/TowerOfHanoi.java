
public class TowerOfHanoi {
	
	public static void towerOfHanoi(int n , char a , char b , char c) {
		if(n == 1) {
			System.out.println("Move " + n + " from "+ a +" to "+ c);
			return;
		}
		towerOfHanoi(n-1, a, c, b);
		System.out.println("Move "+ n +" from "+ a +" to " + c);
		towerOfHanoi(n-1, b, a, c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towerOfHanoi(2, 'a', 'b', 'c');
	}

}
