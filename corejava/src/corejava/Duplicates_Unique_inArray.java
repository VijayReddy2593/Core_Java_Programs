package corejava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Duplicates_Unique_inArray {

	public static void main(String[] args) {
		int[] arr={1,2,2,3,4,5,3,6,7,2};
        int max_count=0;
        int max_count_val=0;
		List<Integer> duplicate=new ArrayList<>();
		List<Integer> unique=new ArrayList<>();
		//arr.sort(null);
		for(int i=0;i<arr.length;i++) {
			int count=0;
			int j;
			for(j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
			if(count>max_count) {
				max_count_val=arr[i];
				max_count=count;
			}
			if(count==1) {
				unique.add(arr[i]);
			}
			if(count>1 && !duplicate.contains(arr[i])) {
				duplicate.add(arr[i]);
			}
		}
		System.out.println("Duplicates are:");
		System.out.print(duplicate);
		System.out.println();
		System.out.println("Unique elements are:");
		System.out.print(unique);
        System.out.println();
        System.out.println("Mostly repeated value: ");
        System.out.println("["+max_count_val+"]  which is repeated "+max_count+" times");

	}

}
