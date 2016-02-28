
public class InitArray3 {
public static void main(String[] args){
	
	int[] array = {7, 14, 21, 28, 35, 42, 49, 56, 63, 70};
	System.out.printf("%s%8s%n", "Index", "Value");
	
	for(int counter = 0; counter < array.length; counter++){
		System.out.printf("%5d%8d%n", counter, array[counter]);
	}
}
}
