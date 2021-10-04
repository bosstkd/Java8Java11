package testCodinGame;

import java.lang.ref.SoftReference;
import java.util.EmptyStackException;

public class Stack {

	private Object[] elements;
	private int size=0;
	
	public Stack(int initialCapacity) {
		elements = new Object[initialCapacity];
	}
	
	public void push(Object object) {
		ensureCapacity();
		elements[size++]=object;
		//SoftReference<Object> reference1 = new SoftReference<>(elements);
		//System.out.println(reference1.toString());
	}
	
	public Object pop() {
		if(size == 0) {
			throw new EmptyStackException();
		}
		return elements[--size];
	}
	
	private void ensureCapacity() {
		if(elements.length == size) {
			Object[] old = elements;
			elements = new Object[2*size + 1];

			System.arraycopy(old, 0, elements, 0, size);
		}
	}
	
	public static void main (String[] args) {
		
		System.out.println(256>>4);
		Stack stack = new Stack(20);
		
		for(int i = 0; i<20; i++) {
			stack.push("a large, large, large, large, string "+i);
		}
		
		for(int i = 0; i<20; i++) {
			System.out.println(stack.pop());
		}
	}
}
