package main;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Read_Sort implements Read_Sort_Interface{
	
	Sort_Interface si;
	
	public void set_Sort_Interface(Sort_Interface si) {
		this.si=si;
		
	}

	@Override
	public int[] readsort(ArrayList list) {
		// TODO Auto-generated method stub
		
		
		int[] array=read(list);
		
		return sort(array);
		
		
	}
	
	public int[] read(ArrayList list) {
		int[] array=new int[list.size()];
		for(int i=0;i<list.size();i++) {
			array[i]=(int)list.get(i);
		}
		return array;
	}
	
	public int[] sort( int[] array) {
		//return new int[] {9,2,1};
		return si.sort(array);
		
	}

}
