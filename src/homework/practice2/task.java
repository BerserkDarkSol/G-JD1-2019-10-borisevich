package homework.practice2;

public class task {

	public static void main(String[] args) {
		int array[] = { 1, -2, 2, -2, 3 };
		int a[] = array.clone();
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] + 1;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(array[i]);	
		}
		
		for (int i = 0; i < a.length; i++) {
			a[i] = array[i];
		}
		
	}

}
