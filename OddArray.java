import java.awt.List;
import java.util.ArrayList;

public class OddArray {

	public static void main(String[] args) {
		int a[] = {2,5,4,6,44,23,33,57};
		System.out.print("Initial Array :{");
		for(int i =0 ; i<a.length ; i++) {			
			System.out.print(a[i] + " ");	
		}
		System.out.println("}");
		OddArray.findOdd(a);
		
	}

	private static void findOdd(int[] a) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i =0 ; i<a.length ; i++) {
			if(a[i]%2==1){
				list.add(a[i]);		
			}
		}
		
		int[] arr = new int[list.size()];	
		for(int i = 0; i < list.size(); i++) {
		    if (list.get(i) != null) {
		        arr[i] = list.get(i);
		    }
		}
		System.out.print("Odd Array : {");
		for(int i =0 ; i<arr.length ; i++) {			
			System.out.print(arr[i] + " ");	
		}	
		System.out.print("}");
	}

}
