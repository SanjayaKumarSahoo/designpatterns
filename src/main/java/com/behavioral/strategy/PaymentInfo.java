package com.behavioral.strategy;

import java.math.BigDecimal;
import java.util.Date;

public class PaymentInfo {

	private final String cardHolderName;
	private final String cardNumber;
	private final Date cardExpiry;
	private final String cvv;
	private final BigDecimal amount;

	private PaymentInfo(Builder builder) {
		this.cardHolderName = builder.cardHolderName;
		this.cardNumber = builder.cardNumber;
		this.cardExpiry = builder.cardExpiry;
		this.cvv = builder.cvv;
		this.amount = builder.amount;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public Date getCardExpiry() {
		return cardExpiry;
	}

	public String getCvv() {
		return cvv;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public static final class Builder {
		private String cardHolderName;
		private String cardNumber;
		private Date cardExpiry;
		private String cvv;
		private BigDecimal amount;

		public Builder withCardHolderName(String cardHolderName) {
			this.cardHolderName = cardHolderName;
			return this;
		}

		public Builder withCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
			return this;
		}

		public Builder withCardExpiry(Date cardExpiry) {
			this.cardExpiry = cardExpiry;
			return this;
		}

		public Builder withCVV(String cvv) {
			this.cvv = cvv;
			return this;
		}

		public Builder withAmount(BigDecimal amount) {
			this.amount = amount;
			return this;
		}

		public PaymentInfo build() {
			return new PaymentInfo(this);
		}

	}
}
