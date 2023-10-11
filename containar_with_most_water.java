package mypro;
import java.util.*;
public class containar_with_most_water {
//	public static int storeWater(ArrayList<Integer>hight) {
//		int maxWater=0;
//		//brute force 
//		for(int i=0; i<hight.size(); i++) {
//			for(int j=i+1; j<hight.size(); j++) {
//				int ht =Math.min(hight.get(i),hight.get( j));
//				int width=j-i;
//				int currwater=ht*width;
//				maxWater=Math.max(maxWater,currwater);
//				
//			}
//		}
//		
//		return maxWater;
//	}
	
	// 2 pointer approache
	
	public static int storeWater(ArrayList<Integer>hight) {
		int maxwater=0;
		int lp=0;
		int rp=hight.size()-1;
		
		while(lp<rp) {
			int ht=Math.min(hight.get(lp), hight.get(rp));
			int width=rp-lp;
			int currwater=ht*width;
			maxwater=Math.max(maxwater, currwater);
			
			if(hight.get(lp)<hight.get(rp)) {
				lp++;
				
			}
			else {
				rp--;
			}
		}
		
		return maxwater;
	}
	

	public static void main(String[] args) {
		ArrayList<Integer>hight=new ArrayList<>();
		hight.add(1);
		hight.add(8);
		hight.add(6);
		hight.add(2);
		hight.add(5);
		hight.add(4);
		hight.add(8);
		hight.add(3);
		hight.add(7);
		
		
		System.out.println(storeWater(hight));
		

	}

}
