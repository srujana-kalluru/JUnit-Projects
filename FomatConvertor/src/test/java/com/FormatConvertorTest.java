package com;


import org.junit.Test;

import static org.junit.Assert.fail;

public class FormatConvertorTest {

	@Test
	public final void testConvert() {
		Input input=new Input("",5);
		try{
			FormatConvertor.convert(input);
		} catch (Exception e) {
			fail(input.getText()+","+input.getNum()+"\n"+ e);
		}
	}

}
