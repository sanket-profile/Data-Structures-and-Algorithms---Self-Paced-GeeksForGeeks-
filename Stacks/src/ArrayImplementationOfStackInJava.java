import java.util.ArrayList;

class MyStackArray{
	int size;
	int capacity;
	int[] arr;
	MyStackArray(int capacity){
		this.capacity = capacity;
		arr = new int[capacity];
		this.size = 0;
	}
	public int push(int x) {
		if(size < capacity) {
			arr[size] = x;
			size++;
			return size;
		}else {
			return -1;
		}
	}
	
	public int peek() {
		if(size == 0) {
			return -1;
		}else {
			return arr[size-1];
		}
	}
	
	public int pop() {
		if(size == 0) {
			return -1;
		}else {
			int x = arr[size-1];
			arr[size-1] = 0;
			size--;
			return x;
		}
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}else {
			return false;
		}
	}
}

class MyStackArrayArrayList{
	ArrayList<Integer> arr = new ArrayList<>();
	public boolean push(int x) {
		return arr.add(x);
	}
	
	public int peek() {
		if(arr.size() == 0) {
			return -1;
		}
		return arr.get(arr.size()-1);
	}
	
	public int pop() {
		if(arr.size() == 0) {
			return -1;
		}
		int x = arr.get(arr.size()-1);
		arr.remove(arr.size()-1);
		return x;
	}
	
	public int size() {
		return arr.size();
	}
	
	public boolean isEmpty() {
		if(arr.size() == 0) {
			return true;
		}else {
			return false;
		}
	}
}

public class ArrayImplementationOfStackInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*MyStackArray m = new MyStackArray(10);
		m.push(5);
		m.push(15);
		m.push(25);
		System.out.println(m.peek());
		System.out.println(m.pop());
		m.push(35);
		System.out.println(m.size());
		System.out.println(m.isEmpty());*/
		
		MyStackArrayArrayList m = new MyStackArrayArrayList();
		m.push(5);
		m.push(15);
		m.push(25);
		System.out.println(m.peek());
		System.out.println(m.pop());
		m.push(35);
		System.out.println(m.size());
		System.out.println(m.isEmpty());
	}

}
