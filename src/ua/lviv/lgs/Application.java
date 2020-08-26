package ua.lviv.lgs;

import java.util.Random;

public class Application {

	public static void main(String[] args) {
		byte a0 = 1;
		short a1 = 1;
		int a2 = 1;
		long a3 = 1l;
		float a4 = 1.1f;
		double a5 = 1.1;
		char a6 = '\u0000';
		char a7 = '\uffff';
		boolean a8 = true;
		System.out.println("BYTE Range from: " + Byte.MIN_VALUE + " to: " + Byte.MAX_VALUE);
		System.out.println("SHORT Range from: " + Short.MIN_VALUE + " to: " + Short.MAX_VALUE);
		System.out.println("INT Range from: " + Integer.MIN_VALUE + " to: " + Integer.MAX_VALUE);
		System.out.println("LONG Range from: " + Long.MIN_VALUE + " to: " + Long.MAX_VALUE);
		System.out.println("FLOAT Range from: " + Float.MIN_VALUE + " to: " + Float.MAX_VALUE);
		System.out.println("DOUBLE Range from: " + Double.MIN_VALUE + " to: " + Double.MAX_VALUE);
		System.out.println("CHAR Range from: " + (int)a6 + " to: " + (int)a7 + ""); // ?? не впевнений, що це найкраще вирішення задачі))
		System.out.println("BOOLEAN Range from: " + Boolean.FALSE + " to: " + Boolean.TRUE); // ??
		
		final Random random = new Random();
		int [] arr = new int [10];
		for (int i = 0; i< arr.length;i++)
		{
			arr[i] = random.nextInt();
		}
		System.out.println("Your array:");
		for (int i = 0; i< arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		int min = arr[0];
		int max = arr[0];

		for (int i : arr) {
			if (i < min) {
				min = i;
			}
			if (i > max) {
				max = i;
			}
		}

		System.out.println("minValue " + min);
		System.out.println("maxValue " + max);
		
	}

}
