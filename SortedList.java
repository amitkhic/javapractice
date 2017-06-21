
import java.util.ArrayList;
import java.util.Collections;

public class SortedList {

	public static void main(String[] args) {		
		ArrayList<String> list = new ArrayList<>();
		list.add("car");
		list.add("truck");
		list.add("8");
		list.add("4");
		list.add("bus");
		list.add("6");
		list.add("1");
		System.out.print("List before sorting :" );
		for(String obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
		SortedList.sort(list);
	}

	private static void sort(ArrayList<String> list) {
		
		ArrayList<Integer> listInt = new ArrayList<>();
		ArrayList<String> listStr = new ArrayList<>();
		for(String obj : list) {
			boolean isNumber = true;
			int add = 0;
		    try {		    	
		         add= Integer.parseInt(obj);
		    }catch (NumberFormatException e) {
		    	isNumber = false;
		    }
		    if(isNumber){
		    	listInt.add(add);
		    }else{
		    	listStr.add(obj);
		    }		    	
		}
		
		int intIndex = 0 ;
		int strIndex = 0;
		
		Collections.sort(listInt);
	    Collections.sort(listStr);
	    
		for (int i = 0; i < list.size(); i++) { 
			boolean isNumber = true;
			int add = 0;
		    try {		    	
		         add= Integer.parseInt(list.get(i));
		    }catch (NumberFormatException e) {
		    	isNumber = false;
		    }
		    if(isNumber){
		    	list.set(i,Integer.toString(listInt.get(intIndex++)));
		    }else{
		    	list.set(i, listStr.get(strIndex++));
		    }  
		 }
		System.out.print("List After sorting :" );
		for(String obj : list) {
			System.out.print(obj + " ");
		}

	}
}
		
		
		
		
	

