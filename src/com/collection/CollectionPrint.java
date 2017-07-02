package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @packageName
 * @projectName testRun
 * @author Administrator
 * @time 2017上午11:11:40
 * @tags
 */
public class CollectionPrint {

	private int id;
	private String name;

	public CollectionPrint(int tid, String tname) {
		id = tid;
		name = tname;
	}

	public String toString() {
		return id + "_" + name;
	}

	/**
	 * 
	 * @description
	 * @param args
	 * @return String
	 * @time 2017上午11:04:05
	 */
	public static void main(String[] args) {
		List<Integer> list0 = Arrays.asList(0, 1, 2, 3, 4, 5);
		System.out.println(list0);
		List<CollectionPrint> list1 = Arrays.asList(new CollectionPrint(1, "a"), new CollectionPrint(2,
				"b")); // 重写toString方法就可以完成打印
		System.out.println(list1);
		Map<Integer, String> map0 = new HashMap<Integer, String>();
		map0.put(0, "a");
		map0.put(1, "b");
		System.out.println(map0);
		Map<Integer, CollectionPrint> map1 = new HashMap<Integer, CollectionPrint>();
		map1.put(0, new CollectionPrint(0, "a"));
		map1.put(1, new CollectionPrint(1, "b"));
		System.out.println(map1);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
