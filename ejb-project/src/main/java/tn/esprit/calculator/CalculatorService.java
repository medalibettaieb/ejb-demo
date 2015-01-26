package tn.esprit.calculator;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class CalculatorService
 */
@Stateless
public class CalculatorService implements CalculatorServiceRemote,
		CalculatorServiceLocal {

	/**
	 * Default constructor.
	 */
	public CalculatorService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer add(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}
