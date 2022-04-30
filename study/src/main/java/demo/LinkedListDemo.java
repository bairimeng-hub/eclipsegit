package demo;


import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public final class LinkedListDemo {

	public static void main(String[] args) {
		// 作为普通队列
		Queue<String> queue=new LinkedList<>();
		
		//增：add、offer
		queue.add("A");
		queue.offer("B");
		queue.add("B");
		
		//查：peek、element
		System.out.println(queue.peek());
		System.out.println(queue.element());
		
		//删：remove、poll
		System.out.println(queue.remove());
		System.out.println(queue.poll());
		
	
		//作为双端队列
		Deque<String> deque=new LinkedList<>();
		//增 addFirst、addLast、offerFirst、offerLast
		deque.add(null);
		deque.add(null);
		deque.addFirst("A");
		deque.offerLast("B");
		for(String d:deque) {
		System.out.println(d);
	}
		//查 getFirst、getLast、peekFirst、peekLast
		
		//删 removeFirst、removeLast、pollFirst、pollLast
		//除此之外还有Queue的6个方法
		
		//作为堆栈
//		LinkedList<String> link=new LinkedList<>();
//		link.push("我多平常");
//		link.push("我要推开过往");
//		link.push("我多坦荡");
//		System.out.println(link.peek());
//		System.out.println(link.pop());
//		for(String l:link) {
//			System.out.println(l);
//		}
		
		//作为数组,方法与ArrayList一样
	    List<String> list=new LinkedList<String>();
		
		

	}

}
