package com.owr.division;

import java.util.List;

public class DataResult {

//	private List<Action> actions;
	private List<Iteration> iterations;
	private long result = 0;
	private long remainder = 0;

	public DataResult(List<Iteration> iterations, long result, long remainder) {
		super();
		this.iterations = iterations;
		this.result = result;
		this.remainder = remainder;
	}

	public List<Iteration> getIterations() {
		return iterations;
	}

	public long getResult() {
		return result;
	}

	public long getRemainder() {
		return remainder;
	}

}
