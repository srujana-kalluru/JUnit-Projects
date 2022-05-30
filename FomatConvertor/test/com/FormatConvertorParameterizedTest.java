package com;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runners.*;

import factory.NumberFactory;
import factory.TextFactory;

import org.junit.runner.*;

@RunWith(Parameterized.class)
public class FormatConvertorParameterizedTest {

	Input input;

	public FormatConvertorParameterizedTest(Input input) {
		super();
		this.input = input;
	}

	@Parameterized.Parameters
	public static ArrayList<Input> getInputList() {
		ArrayList<Input> inputList = new ArrayList<Input>();
		for (String text : TextFactory.getTextList()) {
			for (int num : NumberFactory.getNumberList()) {
				Input input = new Input(text, num);
				inputList.add(input);
			}
		}
		return inputList;

	}

	@Test
	public final void testConvert() {
		FormatConvertor.convert(input);
	}

}
