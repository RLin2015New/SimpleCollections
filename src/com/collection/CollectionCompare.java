package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * @projectName SimpleTesting
 * @fileName CollectionCompare.java
 * @description
 * @author lifl
 * @time 2017下午3:13:17
 *
 */
public class CollectionCompare {

	/**
	 * 
	 * @description
	 * @param args
	 *            void
	 * @time 2017下午3:13:43
	 */
	public static void main(String[] args) {
		// ArrayList<E> 快速的随机访问，较慢的移除和中间插入
		// LinkedList<E> 较快的插入和删除，快速的顺序访问。随机访问较慢

		ArrayList<String> arrayList = new ArrayList<String>();
		LinkedList<String> linkedList = new LinkedList<String>();

		// 这个量级的基础类操作性能差异不大
		for (int i = 0; i < 100000; i++) {
			arrayList.add(i + "");
			linkedList.add(i + "");
		}
		// 测试随机访问
		long t0 = System.currentTimeMillis();
		// arrayList.get(3);
		// arrayList.get(2501);
		// arrayList.get(5001);
		arrayList.remove(5002);
		long t1 = System.currentTimeMillis();
		System.out.println("arrayList get three random need :" + (t1 - t0));
		t0 = System.currentTimeMillis();
		// linkedList.get(3);
		// linkedList.get(2501);
		// linkedList.get(5001);
		linkedList.remove(5002);
		t1 = System.currentTimeMillis();
		System.out.println("linkedList get three random need:" + (t1 - t0));

		// arrayList.retainAll(c)
		// arrayList.containsAll(c)

//		Random random = new Random();
		// random.nex
//		for (String string : linkedList) {
//			
//		}

	}

}
