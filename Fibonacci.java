public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input = 10;
	int a = 0;
	int b=1;
	System.out.print("fibonacci series are "+ a +" " +b);
	for (int i = 2; i <= input; i++) {
		int c=a+b;
	System.out.print(" "+ c);
	a=b;
	b=c;
	}
	}
}
