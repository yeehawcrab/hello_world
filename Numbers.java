import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class Numbers {
   
   private int[] nums;
   
   public void setNums(int[] nums) {
      this.nums = nums;
   }
   
   public int[] getNums() {
      return nums;
   }
   
   public int findMax(){
	   
		
	   ArrayList<Integer> arr = new ArrayList<Integer>(nums.length);
        for(int i = 0; i < nums.length; ++i) {  
        	arr.add(nums[i]);	
        	
        }
        Collections.sort(arr);
        return (arr.get(arr.size() - 1));
		
		          
   }
   
   // Fill array nums with pseudo-random integers (0-999) with a seed value
   public void fillRandomly(int seed, int size){
      Random rand = new Random(seed);
      nums = new int[size];
      for(int i = 0; i < nums.length; ++i){
         nums[i] = rand.nextInt(1000);
      }
   }   
}
