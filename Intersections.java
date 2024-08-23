import java.lang.reflect.Array;
public class intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1[] = {2,3,4,5,6,8,7};
int num2[]= {2,11,12,15,42,7};
 
for (int i = 0; i <= num1.length-1; i++) {
	int found=0;
	for (int j = 0; j <= num2.length-1; j++) {
if( num1[i] == num2[j]) {
	found=1;
	break;
	
}
	}
	
if(found == 1){
	System.out.println("intersection numbers are"+ num1[i]);
}
}
	}

}
