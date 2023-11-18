package com.owr.division;

public class ActionSubtraction implements Action {

	private int pos;
	private long origRemainder;
	private int subs;
	private long remainder;

	public ActionSubtraction(int pos, long origRemainder, int subs, long remainder) {
		super();
		this.pos = pos;
		this.origRemainder = origRemainder;
		this.subs = subs;
		this.remainder = remainder;
	}

	public int getPos() {
		return pos;
	}

	public long getOrigRemainder() {
		return origRemainder;
	}

	public int getSubs() {
		return subs;
	}

	public long getRemainder() {
		return remainder;
	}

}
