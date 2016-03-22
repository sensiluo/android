package peri.luo.datastructure;

/**
 * 
 * @author H_P
 * @version 1.0
 * @param <T>
 *            a demo for doublelinkedlist datastructure
 */
public class DoubleLinkedList<T> {
	private DNode<T> mHead;
	private int mCount;

	private class DNode<T> {
		public DNode<T> prior;
		public DNode<T> next;
		public T value;

		public DNode(DNode<T> prior, DNode<T> next, T value) {
			this.prior = prior;
			this.next = next;
			this.value = value;
		}
	}

	public DoubleLinkedList() {
		mHead = new DNode<T>(null, null, null);
		mHead.prior = mHead.next = mHead;
		mCount = 0;
	}

	public int size() {
		return mCount;
	}

	public boolean isEmpty() {
		return mCount == 0;
	}

//	public void clear() {
//		for (int i = 0; i < mCount; i++) {
//			del(i);
//		}
//	}

	private DNode<T> getNode(int index) {
		if (index < 0 || index >= mCount) {
			throw new IndexOutOfBoundsException();
		}
		if (index < mCount / 2) {
			DNode<T> node = mHead.next;
			for (int i = 0; i < index; i++)
				node = node.next;
			return node;
		}
		DNode<T> rNode = mHead.prior;
		int rIndex = mCount - index - 1;
		for (int j = 0; j < rIndex; j++) {
			rNode = rNode.prior;
		}
		return rNode;
	}

	public T get(int index) {
		return getNode(index).value;
	}

	public T getFirst(int index) {
		return getNode(0).value;
	}

	public T getLast(int index) {
		return getNode(mCount - 1).value;
	}

	public void insert(int index, T t) {
		if (index == 0) {
			DNode<T> node = new DNode<T>(mHead, mHead.next, t);
			mHead.next.prior = node;
			mHead.next = node;
			mCount++;
			return;
		}
		DNode<T> node = getNode(index);
		DNode<T> iNode = new DNode<T>(node.prior, node, t);
		node.prior.next = iNode;
		node.prior = iNode;
		mCount++;
		return;
	}

	public void insertFirst(T t) {
		insert(0, t);
	}

	public void appendLast(T t) {
		DNode<T> node = new DNode<T>(mHead.prior, mHead, t);
		mHead.prior.next = node;
		mHead.prior = node;
		mCount++;
	}

	public void del(int index) {
		DNode<T> node = getNode(index);
		node.prior.next = node.next;
		node.next.prior = node.prior;
		node = null;
		mCount--;
	}

	public void delFirst() {
		del(0);
	}

	public void delLast() {
		del(mCount - 1);
	}
}
