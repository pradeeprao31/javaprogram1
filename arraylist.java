package mypro;
import java.util.ArrayList;
public class arraylist {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList();
		ArrayList<String>list2=new ArrayList();
		ArrayList<Boolean>list3=new ArrayList();
		//add operation 
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		//System.out.println(list);
		
		// Get operation
		int element= list.get(2);
		//System.out.print(element);
		
		
		// Remove operation 
		
		list.remove(0);
		//System.out.println(list);
		
		
		// set element at index
		
		
		list.set(0,07);
		//System.out.println(list);
		
		// contains element
		//System.out.println(list.contains(1));
		//System.out.println(list.contains(7));
	
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
System.out.println();
	}

}
