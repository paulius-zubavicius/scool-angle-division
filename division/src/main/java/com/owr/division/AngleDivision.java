package com.owr.division;

import java.util.ArrayList;
import java.util.List;

public class AngleDivision {

//	public DataResult div(DataInput data) {
//
//		List<Action> actions = new ArrayList<>();
//		long result = 0;
//		long remainder = 0;
//
//		int[] nums = splitToNumbers(data.getNum());
//		int div = data.getDiv();
//
//		int curr = 0;
//
//		for (int i = 0; i < nums.length; i++) {
//
//			if (curr < div || curr == 0) { // jei per mazas
//
//				if (i < nums.length) {// imam kita jei yra
//
//					int currOrig = curr;
//
//					curr *= 10; // Push to left ...
//					curr += nums[i];// ... and add to right
//
//					if (i > 0) {
//						actions.add(new ActionMove(i, currOrig, nums[i], curr));
//					}
//				}
//			}
//
//			int r = curr / div;// divide (int part)
//
//			result *= 10;// Push to left ...
//			result += r;// ... and add to right
//			actions.add(new ActionResult(result, r));
//
//			int currOrig = curr;
//
//			curr = curr % div;
//			remainder = curr;
//
//			actions.add(new ActionSubtraction(i, currOrig, r * div, remainder));
//
//		}
//
//		return new DataResult(actions, result, remainder);
//	}

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
