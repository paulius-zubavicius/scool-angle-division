package com.owr.division;

public class App {

	public static void main(String[] args) {

		Long num = Long.valueOf(args[0]);
		int div = Integer.valueOf(args[1]);

		DataInput data = new DataInput(num, div);

		DataResult result = new AngleDivision2().div(data);

		ActionsOutput out = new ActionsOutput();

		out.angleDivision(data, result, System.out::println);
		System.out.println();
//		System.out.println("Skaičių " + Arrays.toString(data.getNums()) + " daliname iš " + data.getDiv());
		System.out.println("Sveikoji dalis: " + result.getResult());
		System.out.println("Likutis: " + result.getRemainder());
		System.out.println();
		out.description(result, System.out::println);

	}

}
