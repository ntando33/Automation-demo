
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mynum= 5;
		String website = "Ntandpyenkosi Mkhwanazi";
		char letter = 'r';
		double dec=5.99;
		boolean myCard = true;
		
		System.out.println(mynum+"is the value stored in the myNum variable");
		System.out.println(website);

		//Arrays -
		int[] arr = new int[5];// 5, 10
		for (int i=0; i<5;i++) {
			arr[i] = i;
		}
		//int[] arr2 = {1,2,4,5,6};
		for (int k=0; k<5;k++) {
			System.out.print(arr[k] + " ");
		}
		
		// Core Java Brush Up3
		
		String s = "Rahul Shetty Academy";
		String[] splittedString = s.split("Shetty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());

		for(int i =s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}
