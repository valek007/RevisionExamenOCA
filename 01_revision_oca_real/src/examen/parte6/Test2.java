package examen.parte6;

public class Test2 {

	public static void main(String[] args) {
		
		int[] nums1 = new int[3];
		int[] nums2 = {1,2,3,4,5};
		nums1 = nums2;
		
		for (int x : nums1) {
			System.out.print(x+":");
		}
	}
}

//	What is the result?
//		A.1:2:3:4:5:
//		B.1:2:3:
//		C.Compilation fails.
//		D.An ArrayoutofBoundsException is thrown at runtime.
