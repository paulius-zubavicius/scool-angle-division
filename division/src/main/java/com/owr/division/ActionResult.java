package com.owr.division;

public class ActionResult implements Action {

	private long origRemainder;
	private long intPart;
	private long subs;
	private long div;
	private long result;

	public ActionResult(long origRemainder, long intPart, long subs, long div, long result) {
		super();
		this.origRemainder = origRemainder;
		this.intPart = intPart;
		this.subs = subs;
		this.div = div;
		this.result = result;
	}

	public long getOrigRemainder() {
		return origRemainder;
	}

	public long getIntPart() {
		return intPart;
	}

	public long getSubs() {
		return subs;
	}

	public long getDiv() {
		return div;
	}

	public long getResult() {
		return result;
	}

	@Override
	public int getPos() {
		return 0;
	}

}
