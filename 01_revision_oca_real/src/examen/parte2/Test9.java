package examen.parte2;

//You are developing a banking module. You have developed a class named ccMask that has a maskcc method.
//You must ensure that the maskcc method returns a string that hides all digits of the credit card number
//except the four last digits (and the hyphens that separate each group of four digits).
public class Test9 {

	public static void main(String[] args) {
		System.out.println(CCMask.maskCC("1234-5678-9101-1121"));
		
	}
}
//Which two code fragments should you use at line n1, independently, to achieve this requirement?
//	A) StringBuilder sb = new StringBuilder(creditCard);
//		sb.substring(15,19);
//		return x + sb;

//	B) return x + creditCard.substring(15,19);

//	C) StringBuilder sb = new StringBuilder(x);
//		sb.append(creditCard, 15,19);
//		return sb.toString();

//	D) StringBuilder sb = new StringBuilder(creditCard);
//		StringBuilder s = sb.insert(0,x);
//		return s.toString();

class CCMask{
	@SuppressWarnings("unused")
	public static String maskCC(String creditCard) {
		String x = "XXXX-XXXX-XXXX-";
		//line n1
		return null;
	}
}

