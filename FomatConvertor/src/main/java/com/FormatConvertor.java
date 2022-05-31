package com;

public class FormatConvertor {

	public static String convert(Input input) {
		return (String.format("%0" + input.getNum() + "d", Integer.parseInt(input.getText())));
	}

	/*public static void main(String[] args) {
		System.out.println(convert(new Input("56", 8)));
	}*/

}
