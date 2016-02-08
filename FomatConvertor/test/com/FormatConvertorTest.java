package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class FormatConvertorTest {

	@Test
	public final void testConvert() {
		Input input=new Input("",5);
		try{
			FormatConvertor.convert(input);
		} catch (Exception e) {
			fail(input.getText()+","+input.getNum()+"\n"+e.toString());
		}
	}

}
