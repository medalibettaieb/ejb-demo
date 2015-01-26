package tn.esprit.accumulator;

import javax.ejb.Stateful;

/**
 * Session Bean implementation class Accumulator
 */
@Stateful
public class Accumulator implements AccumulatorRemote, AccumulatorLocal {

	Integer x = 0;

	public Accumulator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer add(Integer a) {
		x = x + a;
		return x;
	}

}
