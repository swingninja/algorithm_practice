public class RotateArray {
	public static void main (String[] args) {
		System.out.println("Rotate Array.");
		
		int[] x = new int[]{1,2,3};
		rotate (x, 1);
	}
	
	public static void rotate(int[] nums, int k){
		if (k > nums.length)
			k=k%nums.length;
		
		int[] result = new int[nums.length];
		
		for (int i=0; i <k; i++) {
			result[i] = nums[nums.length-k+i];
		}
		
		int j=0;
		for(int i=k; i<nums.length; i++) {
			result[i]=nums[j];
		j++;
		}
		
		System.arraycopy(result,0, nums, 0, nums.length);
		
		System.out.println(nums[0]);
	}
	
}