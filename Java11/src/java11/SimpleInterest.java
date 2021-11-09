package java11;

public class SimpleInterest {
	public static void main(String[] args) {
		var P=1000;
		var R=2;
		var T=4;
		CalculateSI obj = (var a,var b,var c) -> (a*b*c)/100;
		System.out.println(obj.sI(P, R, T));
	}

}

interface CalculateSI{
	double sI(double P,double R,double T);
}


