package com.behavioral.templatemethod;

public class JSONProcessor extends AbstractProcessor {

	@Override
	void doParse() {
		System.out.println("Parse JSON");
	}

	@Override
	void doValidate() {
		System.out.println("Validate JSON");
	}

}
