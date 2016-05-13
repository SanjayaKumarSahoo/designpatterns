package com.behavioral.chainofresponsibility;

import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ChainOfResponsibilityTest {

	@Mock
	TimeProvider mockTimeProvider;

	@Test
	public void testChainOfResponsibility() {				
		Mockito.when(mockTimeProvider.getDateTime()).thenReturn(createADate(10));		
		GreetingService morning = new MorningGreetingServiceImpl(mockTimeProvider);
		GreetingService afternoon = new AfternoonGreetingServiceImpl(mockTimeProvider);
		GreetingService evening = new EveningGreetingServiceImpl(mockTimeProvider);
		
		morning.setNext(afternoon);
		afternoon.setNext(evening);
		
		String data = morning.greet("Allen");
		Assert.assertEquals("Good Morning, Allen", data);
		
		Mockito.when(mockTimeProvider.getDateTime()).thenReturn(createADate(15));
		data = morning.greet("Allen");
		Assert.assertEquals("Good Afternoon, Allen", data);
		
		
		Mockito.when(mockTimeProvider.getDateTime()).thenReturn(createADate(22));
		data = morning.greet("Allen");
		Assert.assertEquals("Good Evening, Allen", data);
		
	}
	
	private Date createADate(int withHour) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(new Date().getMonth(), new Date().getMonth(), new Date().getDate(), withHour, 20, 20);
		return calendar.getTime();
	}
}
