package kr.hs.emirim.woojy.aopcal.main;

import kr.hs.emirim.woojy.aopcal.cal.ExeTimeCalculator;
import kr.hs.emirim.woojy.aopcal.cal.ImpeCalculator;
import kr.hs.emirim.woojy.aopcal.cal.RecCalculator;

public class MainProxy {

	public static void main(String[] args) {
		ExeTimeCalculator ttCal1 = new ExeTimeCalculator(new ImpeCalculator());
		System.out.println(ttCal1.factorial(20));

		ExeTimeCalculator ttCal2 = new ExeTimeCalculator(new RecCalculator());
		System.out.println(ttCal2.factorial(20));
	}
}