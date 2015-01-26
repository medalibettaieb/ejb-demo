package tn.esprit.accumulator;

import javax.ejb.Remote;

@Remote
public interface AccumulatorRemote {
	Integer add(Integer a);
}
