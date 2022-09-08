package com.single;

/**
 * define a class that has only one instance and provides a global point of access to it
 * a class must ensure that only single instance should be created and single object can be used by all other classes.
 * 
 *Early Instantiation: creation of instance at load time.
  Lazy Instantiation: creation of instance when required.
 
 * */
public class Car {

	
		private static Car obj=new Car();
		private Car() {
			
		}
		public static Car getCar()
		{
			return obj;
		}
		public void something() {
			
		}
		public static void main(String[] args) {
			Car obj1=Car.getCar();
			Car obj2=Car.getCar();
			Car obj3=Car.getCar();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);

	}

}
