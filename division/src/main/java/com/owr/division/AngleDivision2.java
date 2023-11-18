package com.owr.division;

import java.util.ArrayList;
import java.util.List;

public class AngleDivision2 {

	public DataResult div(DataInput data) {

		// Nusikeliam skaiciu (jei neuztenka i rezultata nuli)
		//
		List<Iteration> iterations = new ArrayList<>();
		long result = 0;
		int remainder = 0;

		int[] nums = splitToNumbers(data.getNum());
		int div = data.getDiv();

//		int currRemainder = 0;

		for (int i = 0; i < nums.length; i++) {

			Iteration iterData = new Iteration();
			iterations.add(iterData);
			
			// Prie buvusio likucio pridedam nauja skaiciu
			remainder *= 10;
			remainder += nums[i];
//			System.out.println("Nusikeliam skaiciu: " + nums[i] + " dabar likutis " + remainder);
//			iterations.add(new ActionMove(i, nums[i], remainder));
			iterData.setPos(i);
			iterData.setLiftedDown(nums[i]);
			iterData.setOrigRemainder(remainder);

			// Sveikoji dalybos dalis
			int intPart = remainder / div;
			result *= 10;// Push to left ...
			result += intPart;// ... and add to right

			int subs = intPart * div;
			// Likutis
//			int origRemainder = remainder;
			remainder = remainder - subs;
			
			iterData.setRemainder(remainder);
			iterData.setIntPart(intPart);
			iterData.setSubs(subs);
			iterData.setResult(result);

//			System.out.println(
//					"I likuti " + remainder + " telpa " + intPart + " dalikliu. Prirasom prie rezultato: " + result);
//			actions.add(new ActionResult(origRemainder, intPart, subs, div, result));
//			actions.add(new ActionSubtraction(i, origRemainder, subs, remainder));

		}

//		System.out.println(" Resultatas ir likutis: " + result + " : " + remainder);

		return new DataResult(iterations, result, remainder);
	}

	// 234324 -> [2,3,4,3,2,4]
	private int[] splitToNumbers(long num) {

		List<Integer> ints = new ArrayList<>();
		while (num > 0) {
			ints.add(Long.valueOf(num % 10).intValue());
			num /= 10;
		}

		int[] result = new int[ints.size()];

		for (int i = 0; i < result.length; i++) {
			result[i] = ints.get(result.length - 1 - i);
		}

		return result;
	}
}
