package peri.luo.datastructure;

public class Main {
	public static void main(String[] args) {
		int_test();
		string_test();
		object_test();
	}

	private static void int_test() {
		System.out.println("\n----int_test----");
		// 创建双向链表
		DoubleLinkedList<Integer> dlink = new DoubleLinkedList<Integer>();

		dlink.insert(0, 20); // 将 20 插入到第一个位置
		dlink.appendLast(10); // 将 10 追加到链表末尾
		dlink.insertFirst(30); // 将 30 插入到第一个位置

		// 双向链表是否为空
		System.out.printf("isEmpty()=%b\n", dlink.isEmpty());
		// 双向链表的大小
		System.out.printf("size()=%d\n", dlink.size());
		// 打印出全部的节点
		for (int i = 0; i < dlink.size(); i++)
			System.out.println("dlink(" + i + ")=" + dlink.get(i));
		dlink.delFirst();
		// 打印出全部的节点
		for (int i = 0; i < dlink.size(); i++)
			System.out.println("dlink(" + i + ")=" + dlink.get(i));

	}

	private static void string_test() {
		String[] sarr = { "ten", "twenty", "thirty", "forty" };

		System.out.println("\n----string_test----");
		// 创建双向链表
		DoubleLinkedList<String> dlink = new DoubleLinkedList<String>();

		dlink.insert(0, sarr[1]); // 将 sarr中第2个元素 插入到第一个位置
		dlink.appendLast(sarr[0]); // 将 sarr中第1个元素 追加到链表末尾
		dlink.insertFirst(sarr[2]); // 将 sarr中第3个元素 插入到第一个位置

		// 双向链表是否为空
		System.out.printf("isEmpty()=%b\n", dlink.isEmpty());
		// 双向链表的大小
		System.out.printf("size()=%d\n", dlink.size());

		// 打印出全部的节点
		for (int i = 0; i < dlink.size(); i++)
			System.out.println("dlink(" + i + ")=" + dlink.get(i));
	}

	// 内部类
	private static class Student {
		private int id;
		private String name;

		public Student(int id, String name) {
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() {
			return "[" + id + ", " + name + "]";
		}
	}

	private static Student[] students = new Student[] { new Student(10, "sky"),
			new Student(20, "jody"), new Student(30, "vic"),
			new Student(40, "dan"), };

	private static void object_test() {
		System.out.println("\n----object_test----");
		// 创建双向链表
		DoubleLinkedList<Student> dlink = new DoubleLinkedList<Student>();

		dlink.insert(0, students[1]); // 将 students中第2个元素 插入到第一个位置
		dlink.appendLast(students[0]); // 将 students中第1个元素 追加到链表末尾
		dlink.insertFirst(students[2]); // 将 students中第3个元素 插入到第一个位置

		// 双向链表是否为空
		System.out.printf("isEmpty()=%b\n", dlink.isEmpty());
		// 双向链表的大小
		System.out.printf("size()=%d\n", dlink.size());

		// 打印出全部的节点
		for (int i = 0; i < dlink.size(); i++) {
			System.out.println("dlink(" + i + ")=" + dlink.get(i));
		}
	}
}
