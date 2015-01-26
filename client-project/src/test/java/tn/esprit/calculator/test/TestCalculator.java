package tn.esprit.calculator.test;

import static org.junit.Assert.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Before;
import org.junit.Test;

import tn.esprit.accumulator.AccumulatorRemote;
import tn.esprit.calculator.CalculatorServiceRemote;

public class TestCalculator {
	CalculatorServiceRemote remote;

	@Before
	public void init() {
		try {
			Context ctx = new InitialContext();
			remote = (CalculatorServiceRemote) ctx
					.lookup("ejb-project/CalculatorService!tn.esprit.calculator.CalculatorServiceRemote");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	@Test 
public void doAdd(){
	assertTrue(remote.add(3,6)==9);
	System.out.println(remote.add(3,6));
	
}
}
