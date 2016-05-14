package com.behavioral.templatemethod;

public class XMLProcessor extends AbstractProcessor {

	@Override
	void doParse() {
		System.out.println("Parse XML");
	}

	@Override
	void doValidate() {
		System.out.println("Validate XML");
	}

}
