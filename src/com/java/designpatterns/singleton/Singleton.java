package com.java.designpatterns.singleton;

public class Singleton {

	private static Singleton instance = null;
	
	private volatile int i = 0;

	private Singleton() {
		System.out.println(i);
	}

	public static Singleton getInstance() {
		synchronized (instance) {
			if (instance != null) {
				instance = new Singleton();
			}
		}

		return instance;
	}

}
