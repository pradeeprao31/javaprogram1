package mypro;
import java.util.*;
public class Sorting_an_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList();
		list.add(7);
		list.add(5);
		list.add(9);
		list.add(6);
		list.add(8);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);

	}

}
