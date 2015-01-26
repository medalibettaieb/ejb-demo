package tn.esprit.accumulator;

import javax.ejb.Local;

@Local
public interface AccumulatorLocal {
	Integer add(Integer a);
}
