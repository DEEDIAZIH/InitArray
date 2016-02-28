
public class InitArray {
public static void main(String[] args){
	
	int[] array = { 10, 12, 14, 16, 18, 20, 22, 24, 26, 28};
	
	System.out.printf("%s%8s%n", "Index", "Value");
	
	for (int counter = 0; counter < array.length; counter++){
		System.out.printf("%5d%8d%n", counter, array[counter]);
	}
}
}
