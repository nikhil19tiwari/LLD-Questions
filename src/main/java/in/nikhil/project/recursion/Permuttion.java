package in.nikhil.project.recursion;

import java.util.ArrayList;
import java.util.List;

class Temp{
	 public void rec(int level,int arr[],List<List<Integer>> res) {
		 if(level == arr.length) {
			 List<Integer> ans = new ArrayList<>();
			 for(int i=0;i<arr.length;i++) {
				 ans.add(arr[i]);
			 }
			 res.add(ans);
		 }
		 for(int i=level;i<arr.length;i++) {
			 swap(arr,i,level);
			 rec(level+1,arr,res);
			 swap(arr,i,level);
		 }
	 }

	 private void swap(int[] arr, int i, int level) {
		int temp = arr[i];
		arr[i] = arr[level];
		arr[level] = temp;
		
	 }
 }
public class Permuttion {
	public static void main(String[] args) {

	    int[] arr = {1, 2, 3};

	    List<List<Integer>> res = new ArrayList<>();

	    Temp temp = new Temp();

	    temp.rec(0, arr, res);

	    for (List<Integer> ans : res) {
	        System.out.println(ans);
	    }
	}
}
