
public class InitArray4 {
public static void main(String[] args){
	
	int [] array = new int[500];
	System.out.printf("%s%8s%n", "Index", "Value");
	
	for (int j = 0; j < array.length; j++){
		array[j] = (2 *j) + 2;
		System.out.printf("%5d%8d%n", j, array[j] );
				
	}
}
}
