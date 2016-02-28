
public class InitArray6 {
	public static void main(String[] args){
		int[] array = new int[111];
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for(int j = 0; j< array.length; j++){
			array[j] = (7 * j) + 7;
			System.out.printf("%5d%8d%n", j, array[j]);
		}
	}

}
