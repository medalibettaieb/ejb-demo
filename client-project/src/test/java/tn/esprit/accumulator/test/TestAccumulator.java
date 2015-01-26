package tn.esprit.accumulator.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Before;
import org.junit.Test;

import tn.esprit.accumulator.AccumulatorRemote;

public class TestAccumulator {
	AccumulatorRemote remote;

	@Before
	public void init() {
		try {
			Context ctx = new InitialContext();
			remote = (AccumulatorRemote) ctx
					.lookup("ejb-project/Accumulator!tn.esprit.accumulator.AccumulatorRemote");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void doAdd() {

		System.out.println(remote.add(3));

	}
}
