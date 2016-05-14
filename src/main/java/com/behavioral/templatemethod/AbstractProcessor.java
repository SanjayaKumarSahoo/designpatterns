package com.behavioral.templatemethod;

public abstract class AbstractProcessor implements Processor {

	abstract void doParse();
	abstract void doValidate();

	@Override
	public final void process() {
		doValidate();
		doParse();
		doEnrich();
		doStore();
	}

	private void doEnrich() {
		System.out.println("Enrich parsed data");
	}

	private void doStore() {
		System.out.println("Storing in common data store");
	}

}
