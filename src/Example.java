
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 5};
		modifyArray(array);
		
		modifyElement(array[2]);
		
		
}
	
	public static void modifyArray(int[] array2){
		for (int j: array2){
			System.out.printf(" %3d", j);
		}
	}
	
	
		public static void modifyElement(int element)
		{
			
				element *= 3;
				System.out.printf("%n%3d%n", element);
			
		
		}
}
