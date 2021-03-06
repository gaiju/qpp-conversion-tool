package gov.cms.qpp.conversion.api.model;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstantsTest {
	@Test
	public void testPrivateConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		Constructor<Constants> constructor = Constants.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		constructor.newInstance();
	}
}