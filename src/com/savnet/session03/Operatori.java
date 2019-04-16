package com.savnet.session03;

public class Operatori {
	public static void main(String[] args) {

		int x = 0;
		x++; // x= x+1
		System.out.println(x);
		System.out.println(x++);// post incrementare
		System.out.println(++x); // pre incrementarea
		System.out.println(-x);
		boolean b = true;
		System.out.println(!b);

		System.out.println(~5);
		System.out.println(5 + 7);
		System.out.println(5 * (7 + 3) / 9);
		System.out.println(16 << 1);
		System.out.println(16 << 2);

		System.out.println(16 >> 1);
		System.out.println(16 >> 2);

		System.out.println(16 >>> 1);
		System.out.println(-16 >>> 1);

		System.out.println(10 & 15);
		System.out.println(10 | 15);

		int a = 9;
		System.out.println((a > 4 && a < 10));

		int nota = 10;

		System.out.println((nota >= 9 && nota <= 10) ? " bine" : //
				(nota >= 7 && nota <= 8) ? " satisfacator" : //
						(nota >= 5 && nota <= 6) ? "slab" : "varza");

	}
}
