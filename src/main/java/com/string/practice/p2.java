package com.string.practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class stack
{

}

public class p2 {
	
	public static void main(String[] args)
	{
		List<String> list = new LinkedList<String>();
		list.add("Geeks");
		list.add("for");
		list.add("Geeks");
		list.add("GeeksforGeeks");
		Iterator<String> iter = list.iterator();

		while (iter.hasNext())
			System.out.printf(iter.next() + " ");

		System.out.println();
	}

}
