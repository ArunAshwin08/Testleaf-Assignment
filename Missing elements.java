public class missingnumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []num1  = {3,5,6,7,9,11,13};
int []num2 = {2,4,12,14,17,11,23,7,6};
for (int i = 0; i < num1.length; i++) {
for (int j = 0; j < num2.length; j++) {
	if(num1[i]==num2[j]) {
		System.out.println("duplicate"+num2[j]);
	}
	
}
	
}
	}
	}
