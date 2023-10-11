package mypro;
import java.util.*;
public class pairsum_using_sorted_and_rotated {
	public static boolean pairsum(ArrayList<Integer>list,int target ) {
		int bp=-1;
		int n=list.size();
		for(int i=0; i<list.size(); i++) {
			bp=i;
			break;
		}
		int lp=bp+1;
		int rp=bp;
		while(lp !=rp) {
			//cae 1
			if(list.get(lp)+list.get(rp)==target) {
				return true;
			}
			//case2
			if(list.get(lp)+list.get(rp)<target) {
				lp=(lp+1)%n;
			}
			//case 3
			else {
				rp=(n+rp-1)%n;
			}
			
		}
		
		return false;
	}
	

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(11);
		list.add(15);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(10);
		
		int target= 26;
		System.out.println(pairsum(list,target));
		

	}

}
