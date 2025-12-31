package corejava;

import java.util.ArrayList;
import java.util.List;

public class Combinations_reach_target {

	public static void main(String[] args) {
		int target=11;
		int[] arr= {1, 2, 2, 3, 6, 0, 8, 9, 0, 3, 4, 5, 7};
        List<Integer> l=new ArrayList<>();
       
        for(int i=0;i<arr.length;i++) {
        	 int count=1;
        	for(int j=i+1;j<arr.length;j++) {
        		if(arr[i]==arr[j]) {
        			count++;
        		}
        	}
        	if(count==1) {
        		l.add(arr[i]);
        	}
        }
        System.out.println("Array after removing duplicates");
        for(int a : l) {
        	System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("Combinations are:");
        for(int i=0;i<l.size();i++) {
        	for(int j=i+1;j<l.size();j++) {
        		if(l.get(i)+l.get(j)==target) {
        			System.out.print("("+l.get(i)+","+l.get(j)+")  ");
        		}
        	}
        }
        System.out.println();
        for(int i=0;i<l.size();i++) {
        	for(int j=i+1;j<l.size();j++) {
        		for(int k=j+1;k<l.size();k++) {
        			if(l.get(i)==0 || l.get(j)==0 || l.get(k)==0 ) {
        				continue;
        			}
        		if(l.get(i)+l.get(j)+l.get(k)==target) {
        			System.out.print("("+l.get(i)+","+l.get(j)+","+l.get(k)+")  ");
        		}
        	}
        	}
        }
        System.out.println();
        for(int i=0;i<l.size();i++) {
        	for(int j=i+1;j<l.size();j++) {
        		for(int k=j+1;k<l.size();k++) {
        			for(int m=k+1;m<l.size();m++) {
        				if(l.get(i)==0 || l.get(j)==0 || l.get(k)==0 || l.get(m)==0 ) {
            				continue;
            			}
        		if(l.get(i)+l.get(j)+l.get(k)+l.get(m)==target) {
        			System.out.print("("+l.get(i)+","+l.get(j)+","+l.get(k)+","+l.get(m)+")  ");
        		}
        			}
        	}
        	}
        }
        
	}

}
