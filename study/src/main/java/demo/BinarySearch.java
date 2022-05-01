package demo;

import java.util.Arrays;

//有序数组二分法查找目标数的下标
public class BinarySearch {

	public static void main(String[] args) {
		int[] nums= {1,3,5,7,9,79};
		int findNum=79;
		
		//方法一
		int index=Arrays.binarySearch(nums, findNum);
		System.out.println("index="+index);
		
		//方法二
		int start=0;
		int end=nums.length-1;
		while(true) {
			int mid=(start+end)/2;
			if(nums[mid]==findNum) {
				System.out.println("index="+mid);
				break;
			}else if(nums[mid]>findNum) {
				end=mid-1;				
			}else {
				start=mid+1;
			}
		}


	}

}
