package com.heima.fanse;

import java.lang.reflect.Field;

public class Tool_setProperty {
	public void setProperty(Object obj,String propertyName,Object value) throws  Exception{
		Class clazz=obj.getClass();
		Field f=clazz.getDeclaredField(propertyName);
		f.setAccessible(true);
		f.set(obj, value);
	}
}
