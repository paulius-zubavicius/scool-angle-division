package com.owr.division;

public class ActionMove implements Action {

	private int pos;
	private long remainder;
	private long liftedDown;

	public ActionMove(int pos, long liftedDown, long remainder) {
		super();
		this.pos = pos;
		this.remainder = remainder;
		this.liftedDown = liftedDown;
	}

	public int getPos() {
		return pos;
	}

	public long getRemainder() {
		return remainder;
	}

	public long getLiftedDown() {
		return liftedDown;
	}

}
