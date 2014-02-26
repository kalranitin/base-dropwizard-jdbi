package com.nitin.model;

public class Saying {
	private final long id;
	private final String content;
	public Saying(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
}
