package week1day2;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]num= {2,3,2,6,6,5,7,8,9,};
for (int i = 0; i < num.length; i++) {
for (int j = i+1; j < num.length; j++) {
	if(num[i]==num[j]) {
		System.out.println(num[i]);
	}
	
}	
}
	}

}
