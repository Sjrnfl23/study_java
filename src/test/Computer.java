package test;

public class Computer extends Calculator{
	@Override
	public double gerCircleArea(double param) {
		return param*param*Constants.PAI_2;
	}

}
