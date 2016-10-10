public class RotateArray {
	public static void main (String[] args) {
		System.out.println("Rotate Array.");
		
		int[] x = {1,2,3};

		rotate (x, 1);
	}
	
	private static void rotate(int[] nums, int k){
		for (int a = 0; a < nums.length; a++) {
			System.out.print(nums[a]);
			System.out.print(", ");
		}
			
		System.out.println();
		
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
		
		for (int a = 0; a < nums.length; a++) {
			System.out.print(nums[a]);
			System.out.print(", ");
		}
		System.out.println();
		
	}	
	
}