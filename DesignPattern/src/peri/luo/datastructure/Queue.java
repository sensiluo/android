package peri.luo.datastructure;

import java.lang.reflect.Array;

/**
 * 
 * @author H_P
 * @version 1.0 a demo for Queue Datastructure
 */
public class Queue<T> {
	private T[] mArray;
	private int mCount;

	@SuppressWarnings("unchecked")
	public Queue(Class<T> type, int size) {
		mArray = (T[]) Array.newInstance(type, size);
		mCount = 0;
	}

	public void add(T value) {
		mArray[mCount++] = value;
	}

	public T pop() {
		T ret = mArray[0];
		mCount--;
		for (int i = 1; i < mCount; i++)
			mArray[i - 1] = mArray[i];
		return ret;
	}

	public T front() {
		return mArray[0];
	}

	public int size() {
		return mCount;
	}

	public boolean isEmpty() {
		return size() == 0;
	}
	
	public static void main(String []args){
		Queue<String> queue = new Queue<String>(String.class, 5);
		queue.add("luo");
		queue.add("hui");
		queue.add("ping");
		System.out.println(queue.mCount+"|"+queue.front()+"|"+queue.size());
		System.out.println(queue.pop()+"|"+queue.mCount+"|"+queue.front()+"|"+queue.size());
	}

}
