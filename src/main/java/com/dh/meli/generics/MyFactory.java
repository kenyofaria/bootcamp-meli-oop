package com.dh.meli.generics;

public class MyFactory<T> {

	
	
	public T getInstance(Class<T> clazz) {
		try {
			return clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		} 
		return null;
	}
}
