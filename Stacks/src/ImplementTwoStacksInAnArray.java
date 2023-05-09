class TwoStack{
	
	int[] arr;
	int capacity;
	int size1;
	int size2;
	
	TwoStack(int capacity){
		this.arr = new int[capacity];
		this.capacity = capacity;
		this.size1 = 0;
		this.size2 = 0;
	}
	
	public int push1(int x) {
		int p = (capacity/2) ;
		if(size1 == p) {
			return -1;
		}else {
			arr[size1] = x;
			size1++;
			return size1;
		}
	}
	
	public int push2(int x) {
		//System.out.println(size2 + "dsjmsdkcsmd");
		if(size2 == (capacity/2)) {
			return -1;
		}else {
			arr[(capacity/2)+size2] = x;
			size2++;
			return size2;
		}
	}
	
	public int pop1() {
		if(size1 == 0) {
			return -1;
		}else {
			int x = arr[size1 - 1];
			arr[size1-1] = 0;
			size1--;
			return x;
		}
	}
	
	public int pop2() {
		int p = capacity/2 ;
		if(size2 == 0) {
			return -1;
		}else {
			int x = arr[p + size2 - 1];
			arr[p+size2-1] = 0;
			size2--;
			return x;
		}
	}
	
	public int peek1() {
		if(size1 == 0) {
			return -1;
		}else {
			return arr[size1 -1];
		}
	}
	
	public int peek2() {
		int p = capacity/2;
		if(size2 == (capacity/2)) {
			return -1;
		}else {
			return arr[p + size2 -1];
		}
	}
	
	public int size1() {
		return size1;
	}
	
	public int size2() {
		return size2;
	}
	
	public boolean isEmpty1() {
		return (size1 == 0);
	}
	
	public boolean isEmpty2() {
		return (size2 == 0);
	}
}
public class ImplementTwoStacksInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStack m = new TwoStack(4);
		System.out.println(m.push1(1));
		System.out.println(m.push1(2));
		System.out.println(m.push1(6));
		System.out.println(m.push2(6));
		System.out.println(m.push2(6));
		System.out.println(m.pop2());
		System.out.println(m.pop2());
		System.out.println(m.push2(6));
		System.out.println(m.pop1());
		System.out.println(m.peek2());
		System.out.println(m.size1());
		System.out.println(m.size2());
		System.out.println(m.isEmpty1());
		System.out.println(m.isEmpty2());
	}

}
