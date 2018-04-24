package ch.hslu.oop.sw03;

public class Demo {
	
	public static void main(String [] args)
	{
		//Demo.printForIteration();
		//Demo.printWhileIteration();
		//Demo.printDoWhileIteration();
		//Demo.increaseFloat();
		//Demo.forIncreaseFloat();
		Demo.printBox(4, 4);
	}
	
	public static void printForIteration() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
	}
	
	public static void printWhileIteration() {
		int i = 0;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void printDoWhileIteration() {
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i<=10);
	}
	
	public static void increaseFloat() {
		float number = 0.9f;
		int iterations = 0;
		while(number <= 1f) {
			number += 0.000025;
			iterations++;
		}
		System.out.println(number);
		System.out.println(iterations);
	}
	
	public static void forIncreaseFloat() {
		float number = 0.9f;
		for(int i=0;i<=4000;i++) {
			number += 0.000025;
		}
		System.out.println(number);
	}
	
	public static void printBox(final int height, final int width) {
		for(int h=1;h<=height;h++) {
			for(int w=1;w<=width;w++) {
				if(h==1 || h==height) {
					System.out.print("#");
				} else if(w==1 || w==width) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
}
