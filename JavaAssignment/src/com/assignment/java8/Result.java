package com.assignment.java8;

public class Result {

	public double input(Calculate c, double principal, double rate, double time, double emi) {
		return c.calculate(principal, rate, time, emi);
	}

	public static Calculate emiCalculation() {
		Calculate c1 = (principal, rate, time, emi) -> (principal * rate * Math.pow(1 + rate, time))
				/ (Math.pow(1 + rate, time) - 1);
		return c1;
	}
	
	public static void main(String[] args) {

		Result r = new Result();
		Calculate c;
		double d = 0;
		c = r.emiCalculation();

		d = r.input(c, 1500, 10, 12, 1);

		System.out.println(d);
	}

}
