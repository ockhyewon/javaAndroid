
public class HellowWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hellow world");
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("NO : " + arr[i]);
		}
	}

}
