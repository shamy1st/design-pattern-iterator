package com.shamy1st;

import java.util.Iterator;

import com.shamy1st.iterator.BrowseHistory;

public class Main {

	public static void main(String[] args) {
		BrowseHistory history = new BrowseHistory();
		history.push("http://a");
		history.push("http://b");
		history.push("http://c");
		
		Iterator<String> iterator = history.getIterator();
		iterator.forEachRemaining(url -> System.out.println(url));
	}
}
