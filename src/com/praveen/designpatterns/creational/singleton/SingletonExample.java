package com.praveen.designpatterns.creational.singleton;

public class SingletonExample {

	private SingletonExample() {

	}

	public static class SingletonHolder {
		private static SingletonExample singletonExample = new SingletonExample();
	}

	public static SingletonExample getInstance() {
       return SingletonHolder.singletonExample; 
	}

	public static void main(String[] args) {
		SingletonExample se1= SingletonExample.getInstance();
		SingletonExample se2= SingletonExample.getInstance();
		if(se1.equals(se2)) {
			System.out.println("Single Object");
		}else {
			System.out.println("Multiple Objects");
		}
		
	}

}
