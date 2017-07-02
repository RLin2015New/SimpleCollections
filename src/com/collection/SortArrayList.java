package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @projectName SimpleTesting
 * @fileName SortArrayList.java
 * @description
 * @author lifl
 * @time 2017下午4:20:40
 *
 */

public class SortArrayList extends ArrayList<Integer> {
	/**
	 * 自定义迭代器，倒序排列
	 */
	private static final long serialVersionUID = 449411068159127959L;

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			private int index = size();

			@Override
			public boolean hasNext() {
				return index > 0;
			}

			@Override
			public Integer next() {
				index--;
				return get(index);
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	/**
	 * 
	 * @description
	 * @param args
	 *            void
	 * @time 2017下午4:29:34
	 */
	public static void main(String[] args) {
		SortArrayList sortArrayList = new SortArrayList();
		sortArrayList.addAll(Arrays.asList(0, 1, 2, 3, 4, 5));
		Iterator<Integer> it = sortArrayList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}