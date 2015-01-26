package tn.esprit.calculator;

import javax.ejb.Remote;

@Remote
public interface CalculatorServiceRemote {
	Integer add(Integer a, Integer b);
}
