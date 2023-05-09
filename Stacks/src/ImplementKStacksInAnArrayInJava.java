
class KStack{
	int[] arr;
	int[] next;
	int[] top;
	int free_top = 0;
	int k;
	int cap;
	
	KStack(int k , int n){
		this.k = k;
		this.cap = n;
		arr = new int[cap];
		next = new int[cap];
		top = new int[k];
		for(int i = 0 ; i < k ; i++) {
			top[i] = -1;
		}
		for(int i = 0 ; i < n -1 ; i++) {
			next[i] = i+1;
		}
		next[cap-1] = -1;
	}
	
	public void push(int sn , int x) {
		int i = free_top;
		free_top = next[i];
		next[i] = top[sn];
		top[sn] = i;
		arr[i] = x;
	}
	public int pop(int sn) {
		int i = top[sn];
		top[sn] = next[i];
		next[i] = free_top;
		free_top = i;
		return arr[i];
	}
	public boolean isEmpty(int sn) {
		return (top[sn] == -1);
	}
	
}

public class ImplementKStacksInAnArrayInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
