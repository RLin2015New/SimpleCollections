package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @projectName SimpleTesting
 * @fileName ReverseIterator.java
 * @description
 * @author lifl
 * @time 2017下午4:37:33
 *
 */

public class IteratorTools<T> {
	/**
	 * 2017年7月2日 ReverseIterator Administrator TODO
	 */

	private List<T> list;

	public IteratorTools(List<T> t) {
		setList(t);
	}

	/**
	 * 倒序迭代器
	 * 
	 * @description
	 * @return Iterator<T>
	 * @time 2017下午4:42:24
	 */
	public Iterator<T> getReverseInterator() {
		if (list == null) {
			throw new NullPointerException();
		}
		return new Iterator<T>() {
			private int index = list.size();

			@Override
			public boolean hasNext() {
				return index > 0;
			}

			@Override
			public T next() {
				index--;
				return list.get(index);
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	/**
	 * 随机迭代器
	 * 
	 * @description
	 * @return Iterator<T>
	 * @time 2017下午4:47:13
	 */
	public Iterator<T> getRandomIterator() {
		if (list == null) {
			throw new NullPointerException();
		}
		List<T> randomList = new ArrayList<T>(list);
		Collections.shuffle(randomList, new Random(10));
		return randomList.iterator();
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6);
		IteratorTools<Integer> itTools = new IteratorTools<Integer>(list);
		Iterator<Integer> reverse = itTools.getReverseInterator();
		while (reverse.hasNext()) {
			System.out.println("reverse:" + reverse.next());
		}
		Iterator<Integer> random = itTools.getRandomIterator();
		while (random.hasNext()) {
			System.out.println("random:" + random.next());
		}
		Iterator<Integer> origin = list.iterator();
		while (origin.hasNext()) {
			System.out.println("origin:" + origin.next());
		}

	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
