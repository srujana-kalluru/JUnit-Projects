package com;

public class Input {
	public Input(String text, int num) {
		super();
		this.text = text;
		this.num = num;
	}
	private String text;
	private int num;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

}
