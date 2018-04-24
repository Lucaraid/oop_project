package ch.hslu.oop.sw03;

public class Minmax {
	
	public static void main(String [] args)
	{
		Minmax minmax = new Minmax();
		System.out.println(minmax.min(3, 4));
		int numbers[] = new int[] {1,23,56,134,2,6,78};
		System.out.println(minmax.min(numbers));
		
	}
	
	public Minmax() {
	}
	
	public int max(final int a, final int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	public int min(final int a, final int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}
	
	public int max(final int a, final int b, final int c) {
		if ((a > b) && (a > c)) {
			return a;
		} else if ((b > a) && (b > c)) {
			return b;
		} else {
			return c;
		}
	}
	
	public int min(final int a, final int b, final int c) {
		if ((a < b) && (a < c)) {
			return a;
		} else if ((b < a) && (b < c)) {
			return b;
		} else {
			return c;
		}
	}
	
	public int min2(final int a, final int b, final int c) {
		return Math.min(Math.min(a, b), c);
	}
	
	public int min(int[] numbers) {
		int minValue = numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if (numbers[i] < minValue) {
				minValue = numbers[i];
			}	
		}
		
		return minValue;
	}
	
	public int max(int[] numbers) {
		int maxValue = numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if (numbers[i] > maxValue) {
				maxValue = numbers[i];
			}	
		}
		
		return maxValue;
	}
}
