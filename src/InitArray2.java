
public class InitArray2 {
	public static void main(String [] args){
		
		int[] array = {7, 9, 11, 13, 15, 17, 19, 21, 23, 25};
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for(int counter = 0; counter < array.length; counter++ ){
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
	}

}
