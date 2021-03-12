import java.util.*;
import java.util.ArrayList;
import java.util.Collections;


public class Reverser extends Numbers {
   
      //TODO add some code
      //
      
   	// TODO
   	// return the ArrayList that has the elements 
   	// that Numbers has in int[] nums,
   	// but in the reversed order
   	public ArrayList<Integer> reverse(){
   	  
        Collections.sort(arr);
         
         for(int i = arr.size() - 1; i > arr.size()/2; --i)
         {
        	 //arr.set(arr.size() - i - 1, arr.get(i));
        	 arr.set((arr.size() - i - 1), arr.get(arr.size() - i - 1));
         }
         return arr;
	   }
	   
	   // TODO 
	   // find the second biggest value
	   // keep in mind that the biggest value could be include more 
	   // than once
	   public int findSecondBiggest() {
	      // your code goes here
	   	   return 0;
	   }	 
}
