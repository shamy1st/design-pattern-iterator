package com.shamy1st.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BrowseHistory {

	private List<String> urls = new ArrayList<>();
	
	public void push(String url) {
		urls.add(url);
	}
	
	public String pop() {
		String url = urls.get(urls.size()-1);
		urls.remove(urls.size()-1);
		return url;
	}

	public Iterator<String> getIterator() {
		return new HistoryIterator(this);
	}
	
	public class HistoryIterator implements Iterator<String> {
		
		private BrowseHistory history;
		private int index = 0;
		
		public HistoryIterator(BrowseHistory history) {
			this.history = history;
		}

		@Override
		public boolean hasNext() {
			return (index < history.urls.size()) ? true : false;
		}

		@Override
		public String next() {
			return history.urls.get(index++);
		}
	}
}
